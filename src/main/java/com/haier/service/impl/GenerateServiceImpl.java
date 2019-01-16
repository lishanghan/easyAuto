package com.haier.service.impl;

import bsh.StringUtil;
import com.haier.enums.GenEnum;
import com.haier.enums.GenReplaceKWEnum;
import com.haier.po.Tcase;
import com.haier.po.Ti;
import com.haier.po.Tservice;
import com.haier.service.GenerateService;
import com.haier.service.TcaseService;
import com.haier.service.TiService;
import com.haier.service.TserviceService;
import com.haier.util.HryUtil;
import com.itranswarp.compiler.JavaStringCompiler;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/**
 * @Description: 自动生成测试类并编译至内存中
 * @Author: luqiwei
 * @Date: 2018/11/12 15:47
 */
@Service
@Slf4j
public class GenerateServiceImpl implements GenerateService {
    private String brace_left = GenEnum.BRACE_LEFT.getCode();
    private String brace_right = GenEnum.BRACE_RIGHT.getCode();

    private String gen_package = GenEnum.PACKAGE.getCode();
    private String gen_import = GenEnum.IMPORT.getCode();
    private String gen_class_annotation = GenEnum.CLASS_ANNOTATION.getCode();
    private String gen_class_name = GenEnum.CLASS_NAME.getCode();
    private String gen_constructor = GenEnum.CONSTRUCTOR.getCode();
    private String gen_method_annotation = GenEnum.METHOD_ANNOTATION.getCode();
    private String gen_method = GenEnum.METHOD.getCode();

    @Autowired
    TcaseService tcaseService;

    @Autowired
    TiService tiService;

    @Autowired
    TserviceService tserviceService;


    @Override
    public String generateBase(Tcase tcase) {

       /* Tservice tservice = tserviceService.selectOne(tcase.getServiceid());
        Ti ti = tiService.selectOne(tcase.getIid());


        StringBuffer sb = new StringBuffer();
        sb.append(base_package).append(base_import);//包名与导包
        sb.append(base_class_annotation.replaceAll(GenReplaceKWEnum.SKEY.getRegex(), tservice.getServicekey()));//类注解
        sb.append(base_class_name.replaceAll(GenReplaceKWEnum.CLASS_NAME.getRegex(), tservice.getServicekey() + "Test"));//类名
        sb.append(brace_left);
        sb.append(base_constructor.replaceAll(GenReplaceKWEnum.CLASS_NAME.getRegex(), tservice.getServicekey() + "Test"));
        sb.append(base_method_annotation
                .replaceAll(GenReplaceKWEnum.URI.getRegex(), ti.getIuri())
                .replaceAll(GenReplaceKWEnum.DESC.getRegex(), ti.getRemark() != null ? ti.getRemark() : "")
        );
        sb.append(base_method.replaceAll(GenReplaceKWEnum.METHOD_NAME.getRegex(), HryUtil.iUri2MethodName(ti.getIuri())));
        sb.append(brace_right);

        return sb.toString();*/
        return "success";
    }

    @Override
    public String generateBase(Integer caseId) {
        return this.generateBase(tcaseService.selectOne(caseId));
    }

    /**
     * 生成单个测试方法的测试类
     *
     * @param ti
     */
    public void generateTestClass(Ti ti, Tservice tservice, String singleClassName, String provider) {
        if (null == tservice) {
            tservice = tserviceService.selectOne(ti.getServiceid());
        }
        if (StringUtils.isBlank(singleClassName)) {
            singleClassName = tservice.getServicekey() + "SingleTest_" + HryUtil.generateUUID(null);
        }
        if (StringUtils.isBlank(provider)) {
            provider = "provider";
        }
        StringBuffer sb = new StringBuffer();
        sb.append(GenEnum.PACKAGE.getCode());
        sb.append(GenEnum.IMPORT.getCode());
        sb.append(GenEnum.CLASS_ANNOTATION.getCode().replaceAll(GenReplaceKWEnum.SKEY.getRegex(), tservice.getServicekey()));
        sb.append(GenEnum.CLASS_NAME.getCode().replaceAll(GenReplaceKWEnum.CLASS_NAME.getRegex(), singleClassName));
        sb.append(GenEnum.BRACE_LEFT.getCode());
        sb.append(GenEnum.CONSTRUCTOR_ANNOTATION.getCode());
        sb.append(GenEnum.CONSTRUCTOR.getCode().replaceAll(GenReplaceKWEnum.CLASS_NAME.getRegex(), singleClassName));
        sb.append(GenEnum.METHOD_ANNOTATION.getCode()
                .replaceAll(GenReplaceKWEnum.URI.getRegex(), ti.getIuri())
                .replaceAll(GenReplaceKWEnum.PROVIDER.getRegex(), provider)
                .replaceAll(GenReplaceKWEnum.DESC.getRegex(), ti.getRemark() == null ? "无接口描述" : ti.getRemark())
        );
        sb.append(GenEnum.METHOD.getCode().replaceAll(GenReplaceKWEnum.METHOD_NAME.getRegex(), HryUtil.iUri2MethodName(ti.getIuri())));
        sb.append(GenEnum.BRACE_RIGHT.getCode());

        log.debug("准备生成一个测试方法的测试类:");
        log.debug(sb.toString());

    }

    /**
     * 根据方法列表生成测试类
     *
     * @param tis
     */
    public void generateTestClass(List<Ti> tis, Tservice tservice, String className) {

    }

}
