package com.haier.controller;

import com.haier.config.ZdyProperty;
import com.haier.po.UnionLoginConfig;
import com.haier.service.GenerateService;
import com.haier.util.ClassUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/8/7 19:22
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {
    @Autowired
    UnionLoginConfig unionLoginConfig;

    @Autowired
    GenerateService generateService;

    @GetMapping("/get")
    public void get() {
    }

    @PostMapping("/getClassName")
    public List<String> getClassName() {
        return ClassUtil.getClassName("com.haier.testng.test", false);
    }

    @PostMapping("/gen")
    public String gen(Integer caseId) {
        return generateService.generateBase(caseId);
    }

    @Autowired
    ZdyProperty zdyProperty;

    @PostMapping("/zdyProperty")
    public void ZdyPropretyTest() {
        System.out.println(zdyProperty.getDebug());
    }
}
