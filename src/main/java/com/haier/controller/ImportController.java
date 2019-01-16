package com.haier.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.haier.enums.StatusCodeEnum;
import com.haier.exception.HryException;
import com.haier.po.ImportInterfaceResult;
import com.haier.po.Tservicedetail;
import com.haier.response.Result;
import com.haier.service.ImportService;
import com.haier.service.TservicedetailService;
import com.haier.util.HryHttpClientUtil;
import com.haier.util.IOUtil;
import com.haier.util.JSONUtil;
import com.haier.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/5/18 19:00
 */
@RestController
@Slf4j
@RequestMapping("/import")
public class ImportController {
    @Autowired
    ImportService importService;
    @Autowired
    TservicedetailService tservicedetailService;

    @PostMapping("/interfaceImport")
    public Result interfaceImport(Integer serviceDetailId, Boolean overwrite, Boolean isDelete, String iDev) {
        if (serviceDetailId == null || serviceDetailId == 0) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "tserviceDetail.id必传");
        }
        if (overwrite == null) {
            overwrite = false;
        }
        if (isDelete == null) {
            isDelete = false;
        }
        //1.找到swaggerUrl
        Tservicedetail tservicedetail = tservicedetailService.selectOne(serviceDetailId);
        if (tservicedetail == null || tservicedetail.getSwaggerurl() == null) {
            throw new HryException(StatusCodeEnum.LOGICAL_ERROR, "服务与环境映射中未找到记录,或者找到记录的swaggerUrl不存在,serviceDetailId=" + serviceDetailId);
        }

        //2.通过url发送get请求,得到返回json
        String responseJson = HryHttpClientUtil.get(tservicedetail.getSwaggerurl());
        JSONObject jsonObject;
        try {
            jsonObject = JSON.parseObject(responseJson, Feature.DisableCircularReferenceDetect);
        } catch (Exception e) {
            throw new HryException(StatusCodeEnum.PARSE_JSON_ERROR, "解析Swagger失败,swaggerUrl=" + tservicedetail.getSwaggerurl()
                    + ", swagger内容为: " + responseJson);
        }

        //3.解析json,插入数据到ti表
        ImportInterfaceResult importInterfaceResult = importService.importInterface(tservicedetail.getServiceid(), jsonObject, overwrite,isDelete, iDev);
        return ResultUtil.success(importInterfaceResult);
    }

    @PostMapping("/interfaceImportFromPostman")
    public Result interfaceImportFromPostman(@RequestParam("serviceId") Integer serviceId,//服务id,必填
                                             @RequestParam("envId") Integer envId,//环境id,必填
                                             @RequestParam("overwriteI") Boolean overwriteI,//是否覆盖接口,必填
                                             @RequestParam("overwriteC") Boolean overwriteC,//是否覆盖用例,必填
                                             @RequestParam("cAuthor") String cAuthor,//测试用例设计人员,当前操作人
                                             @RequestParam("jsonFile") MultipartFile jsonFile,//.json文件
                                             String iDev) throws IOException {

        String fileName = jsonFile.getOriginalFilename();
        //文件类型校验
        if (!StringUtils.endsWithIgnoreCase(fileName, ".json")) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "上传的文件类型非.json");
        }

        String read = IOUtil.read(jsonFile.getInputStream());
        if (read != null) {
            read = read.replaceAll("\\s", "");
        }
        JSONObject jsonObject = JSONUtil.str2JSONObj(read);
        if (jsonObject == null) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "解析json文件失败,请确认导入文件内容是否符合json格式");
        }

        ImportInterfaceResult result = importService.importInterface(serviceId, envId, jsonObject, overwriteI, overwriteC, iDev, cAuthor);
        return ResultUtil.success(result);
    }
}
