package com.haier.controller;

import com.haier.enums.AssertTypeEnum;
import com.haier.enums.RequestParamTypeEnum;
import com.haier.enums.StatusCodeEnum;
import com.haier.exception.HryException;
import com.haier.po.Tcase;
import com.haier.po.TcaseCustom;
import com.haier.po.Ti;
import com.haier.response.Result;
import com.haier.service.TcaseService;
import com.haier.service.TiService;
import com.haier.util.JSONUtil;
import com.haier.util.ReflectUtil;
import com.haier.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/5/30 15:05
 */
@Slf4j
@RestController
@RequestMapping("/tcase")
public class TcaseController {

    @Autowired
    TcaseService tcaseService;

    @Autowired
    TiService tiService;

    /**
     * 新增Case
     */
    @PostMapping("/insertOne")
    public Result insertOne(@Validated Tcase tcase) {
        //校验参数和断言类型是否符合JSON格式,
        //校验请求头是否符合JSON格式
        verifyJSON(tcase);
        return ResultUtil.success(tcaseService.insertOne(tcase));
    }

    /**
     * 删除单个tcase记录
     */
    @PostMapping("/deleteOne")
    public Result deleteOne(@RequestParam("id") Integer id) {
        return ResultUtil.success(tcaseService.deleteOne(id));
    }

    /**
     * 根据条件删除tcase记录,现在仅支持根据serviceId,iId或envId删除tcase记录
     */
    @PostMapping("/deleteByCondition")
    public Result deleteByCondition(Tcase tcase) {
        return ResultUtil.success(tcaseService.deleteByCondition(tcase));
    }

    /**
     * 修改case
     */
    @PostMapping("/updateOne")
    public Result updateOne(@Validated Tcase tcase) {
        //请求参数JSON格式校验
        verifyJSON(tcase);
        return ResultUtil.success(tcaseService.updateOne(tcase));
    }

    public void verifyJSON(Tcase tcase) {
        //请求参数校验
        if (StringUtils.isNotBlank(tcase.getRequestparam())) {
            Ti ti = tiService.selectOne(tcase.getIid());
            if (ti != null && ti.getIparamtype().equals(RequestParamTypeEnum.JSON.getId())) {
                String requestParamJSONFormated = JSONUtil.verify(tcase.getRequestparam());
                if (requestParamJSONFormated != null) {
                    tcase.setRequestparam(requestParamJSONFormated);
                } else {
                    throw new HryException(StatusCodeEnum.PARSE_JSON_ERROR, "接口参数类型为JSON时,请求参数必须是JSON格式");
                }
            }
        }
        //请求header校验
        if (StringUtils.isNotBlank(tcase.getRequestheader())) {
            String formattedHeader = JSONUtil.verify(tcase.getRequestheader());
            if (formattedHeader != null) {
                tcase.setRequestheader(formattedHeader);
            } else {
                throw new HryException(StatusCodeEnum.PARSE_JSON_ERROR, "请求Header必须是JSON格式");
            }
        }
        //断言类型JSON格式校验
        if (StringUtils.isNotBlank(tcase.getExpected()) && tcase.getAsserttype().equals(AssertTypeEnum.KEY_VALUE.getId())) {
            String expectedJSONFormated = JSONUtil.verify(tcase.getExpected());
            if (expectedJSONFormated != null) {
                tcase.setExpected(expectedJSONFormated);
            } else {
                throw new HryException(StatusCodeEnum.PARSE_JSON_ERROR, "断言类型为key-value时,期望值必须是JSON格式");
            }
        }
    }


    /**
     * 查-综合查询
     */
    @PostMapping("/selectByCondition")
    public Result selectByCondition(TcaseCustom tcaseCustom, Integer pageNum, Integer pageSize) {
        if (pageNum == null || pageSize == null) {
            pageNum = 1;
            pageSize = 10;
        }
        return ResultUtil.success(tcaseService.selectByContion(tcaseCustom, pageNum, pageSize));
    }

    /**
     * 查-返回List-带Result
     */
    @PostMapping("/selectByConditionSimple")
    public Result selectListByCondition(Tcase tcase) {
        return ResultUtil.success(this.selectList(tcase));
    }

    /**
     * 查-仅返回List
     */
    @PostMapping("/selectList")
    public List<Tcase> selectList(Tcase tcase) {
        return tcaseService.selectByCondition(tcase);
    }


    //查-主键查询
    @PostMapping("/selectOne")
    public Result selectOne(@RequestParam("id") Integer id) {
        return ResultUtil.success(tcaseService.selectOne(id));
    }


    /**
     * 用例新增和编辑页面运行单条用例(新)
     *
     * @param tcase-用例
     * @param userId-用户id
     * @return 测试报告页面地址
     */
    @PostMapping("/runCase")
    public Result runCase(Tcase tcase, Integer userId) {
        ReflectUtil.setInvalidFieldToNull(tcase, false);
        if (tcase == null || tcase.getEnvid() == null) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "运行单条Case时,必须指定运行的环境");
        }
        verifyJSON(tcase);
        return ResultUtil.success(tcaseService.runOne(tcase, userId));
    }

    /**
     * 用例列表页面运行单条用例(新)
     *
     * @param id-tcase.id
     * @param userId-user.id
     * @return 测试报告页面地址
     */
    @PostMapping("/runCaseById")
    public Result runCase(Integer id, Integer userId) {
        Tcase tcase = tcaseService.selectOne(id);
        return this.runCase(tcase, userId);
    }
}
