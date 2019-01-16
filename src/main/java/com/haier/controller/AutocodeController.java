package com.haier.controller;

import com.haier.response.Result;
import com.haier.service.AutocodeService;
import com.haier.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/7/25 20:36
 */
@RestController
@RequestMapping("/autocode")
public class AutocodeController {
    @Autowired
    AutocodeService autocodeService;

/*    @PostMapping("/generate")
    public Result generate() {
        return ResultUtil.success(autocodeService.generate());
    }*/

    /**
     * 自动生成测试基类  ,测试基类只有普通方法,没有逻辑,
     * 测试基类地址:com.haier.testng.base
     */
/*
    @PostMapping("/generateBaseClass")
    public Result generateBaseClass() {
        return ResultUtil.success(autocodeService.generateBaseClass());
    }
*/

    /**
     * 自动生成一个默认的测试类,此测试类将继承于测试基类,独立实现单一接口的测试,接口与接口之间并无联系
     * 测试类地址:com.haier.testng.test
     */
/*
    @PostMapping("/generateDefaultClass")
    public Result generateDefaultClass() {
        return ResultUtil.success(autocodeService.generateDefaultTestClass());
    }
*/
    @PostMapping("/generateTestClass")
    public Result generateTestClass() {
        return ResultUtil.success(autocodeService.generateTestClass());
    }
}
