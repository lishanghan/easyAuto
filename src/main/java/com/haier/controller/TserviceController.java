package com.haier.controller;

import com.haier.enums.RegexEnum;
import com.haier.enums.StatusCodeEnum;
import com.haier.exception.HryException;
import com.haier.po.Tservice;
import com.haier.response.Result;
import com.haier.service.TserviceService;
import com.haier.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/tservice")
public class TserviceController {
    @Autowired
    TserviceService tserviceService;

    /**
     * 查询服务列表,返回分页信息
     */
    @PostMapping(value = "/selectByCondition")
    public Result selectByCondition(Tservice tservice, Integer pageNum, Integer pageSize) {
        if (pageNum == null || pageSize == null) {
            pageNum = 1;
            pageSize = 10;
        }
        return ResultUtil.success(tserviceService.selectByCondition(tservice, pageNum, pageSize));
    }

    /**
     * 查询服务列表,不带分页信息
     */
    @PostMapping("/selectByConditionSimple")
    public Result selectByConditionSimple(Tservice tservice) {
        return ResultUtil.success(tserviceService.selectByCondition(tservice));
    }

    @PostMapping("/selectList")
    public List<Tservice> selectList(Tservice tservice) {
        return tserviceService.selectByCondition(tservice);
    }

    /**
     * 查询单个服务信息
     */
    @PostMapping(value = "/selectOne")
    public Result selectOne(Integer tserviceId) {
        Tservice tservice = tserviceService.selectOne(tserviceId);
        return ResultUtil.success(tservice);
    }

    /**
     * 添加服务
     */
    @PostMapping(value = "/insertOne")
    public Result insertOne(@Validated Tservice tservice) {
        //serviceKey格式校验
        if (!tservice.getServicekey().matches(RegexEnum.CLASSNAME_REGEX.getRegex())) {
            throw new HryException(StatusCodeEnum.REGEX_ERROR, "服务标识(serviceKey):首字符必须是大写字母,其余部分只能由字母,数字或下划线组成");
        }

        //数据重复性校验
        Tservice condition = new Tservice();
        condition.setServicekey(tservice.getServicekey());
        List<Tservice> tservices = this.selectList(condition);

        for (Tservice s : tservices) {
            if (tservice.getServicekey().equals(s.getServicekey())) {
                throw new HryException(StatusCodeEnum.EXIST_RECORD);
            }
        }
        return ResultUtil.success(tserviceService.insertOne(tservice));
    }

    /**
     * 编辑服务
     */
    @PostMapping(value = "/updateOne")
    public Result updateOne(Tservice tservice) {
        //数据校验
        if (tservice.getServicekey() != null) {
            //serviceKey格式校验
            if (!tservice.getServicekey().matches(RegexEnum.CLASSNAME_REGEX.getRegex())) {
                throw new HryException(StatusCodeEnum.REGEX_ERROR, "服务标识(serviceKey):首字符必须是大写字母,其余部分只能由字母,数字或下划线组成");
            }
            //serviceKey唯一性校验
            Tservice condition = new Tservice();
            condition.setServicekey(tservice.getServicekey());
            List<Tservice> tservices = this.selectList(condition);
            for (Tservice s : tservices) {
                if (tservice.getServicekey().equals(s.getServicekey()) && !tservice.getId().equals(s.getId())) {//id不相同,但是servicekey相同
                    throw new HryException(StatusCodeEnum.EXIST_RECORD, "存在相同的servicekey(环境标识)");
                }
            }
        }
        return ResultUtil.success(tserviceService.updateOne(tservice));
    }

    /**
     * 删除服务
     */
    @PostMapping(value = "/deleteOne")
    public Result deleteOne(Integer id) {
        return ResultUtil.success(tserviceService.deleteOne(id));
    }

    /**
     * 获取本系统中所有服务对应的测试类(扫描包名为PackageEnum.TEST)
     */
    @PostMapping("/getTestClasses")
    public Result getTestClasses() {
        return ResultUtil.success(tserviceService.getTestClasses());
    }

    /**
     * 根据serviceKey查询此服务下的测试类
     *
     * @param sKey
     * @return
     */
    @PostMapping("/getTestClassesBySKey")
    public Result getTestClassesBySKey(String sKey) {
        return ResultUtil.success(tserviceService.getTestClasses(sKey));
    }

    /**
     * 根据serviceId查询此服务下的测试类
     *
     * @param sId
     * @return
     */
    @PostMapping("/getTestClassesBySId")
    public Result getTestClassesBySId(Integer sId) {
        return ResultUtil.success(tserviceService.getTestClasses(sId));
    }


}
