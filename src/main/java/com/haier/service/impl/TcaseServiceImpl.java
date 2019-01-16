package com.haier.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haier.enums.PackageEnum;
import com.haier.enums.SortEnum;
import com.haier.enums.StatusCodeEnum;
import com.haier.enums.StatusEnum;
import com.haier.exception.HryException;
import com.haier.mapper.TcaseCustomMapper;
import com.haier.mapper.TcaseMapper;
import com.haier.po.*;
import com.haier.service.*;
import com.haier.testng.run.Runner;
import com.haier.util.HryUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/5/24 17:07
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Slf4j
@Service
public class TcaseServiceImpl implements TcaseService {

    @Value("${zdy.reportPath}")
    String reportPath;

    @Value("${zdy.resourcePathPattern}")
    String resourcePathPattern;

    @Autowired
    TcaseMapper tcaseMapper;

    @Autowired
    TcaseCustomMapper tcaseCustomMapper;

    @Autowired
    TserviceService tserviceService;

    @Autowired
    TservicedetailService tservicedetailService;

    @Autowired
    TenvService tenvService;

    @Autowired
    TiService tiService;

    @Autowired
    Runner runner;

    @Autowired
    UserService userService;

    @Autowired
    TreportService treportService;


    @Override
    public Integer insertOne(Tcase tcase) {
        tcaseMapper.insertSelective(tcase);
        return tcase.getId();
    }

    @Override
    public Integer deleteOne(Integer id) {
        Tcase tcase = new Tcase();
        tcase.setId(id);
        tcase.setStatus(StatusEnum._ONE.getId());
        return tcaseMapper.updateByPrimaryKeySelective(tcase);
    }

    @Override
    public Integer deleteByCondition(Tcase tcase) {
        if (tcase == null || !ObjectUtils.anyNotNull(tcase.getIid(), tcase.getEnvid(), tcase.getServiceid())) {
            return null;
        }
        TcaseExample tcaseExample = new TcaseExample();
        TcaseExample.Criteria criteria = tcaseExample.createCriteria();
        criteria.andStatusGreaterThan(0);
        if (tcase != null) {
            if (tcase.getIid() != null) {
                criteria.andIidEqualTo(tcase.getIid());
            }
            if (tcase.getEnvid() != null) {
                criteria.andEnvidEqualTo(tcase.getEnvid());
            }
            if (tcase.getServiceid() != null) {
                criteria.andServiceidEqualTo(tcase.getServiceid());
            }
        }
        Tcase t = new Tcase();
        t.setStatus(StatusEnum._ONE.getId());
        return tcaseMapper.updateByExampleSelective(t, tcaseExample);
    }

    @Override
    public Integer updateOne(Tcase tcase) {
        return tcaseMapper.updateByPrimaryKeySelective(tcase);
    }

    @Override
    public Tcase selectOne(Integer id) {
        return tcaseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Tcase> selectByCondition(Tcase tcase) {
        TcaseExample tcaseExample = new TcaseExample();
        TcaseExample.Criteria criteria = tcaseExample.createCriteria();
        TcaseExample.Criteria criteria2 = null;
        criteria.andStatusGreaterThan(0);
        if (tcase != null) {
            if (tcase.getEnvid() != null) {
                criteria.andEnvidEqualTo(tcase.getEnvid());
                /**
                 * 不仅要获取传入的EnvID的用例,还需要获取EnvID=0的用例,EnvId=0表明此用例可运行于任意环境
                 */
                criteria2 = tcaseExample.createCriteria();
                criteria2.andStatusGreaterThan(0);
                criteria2.andEnvidEqualTo(0);
                if (tcase.getServiceid() != null) {
                    criteria2.andServiceidEqualTo(tcase.getServiceid());
                }
                if (tcase.getIid() != null) {
                    criteria2.andIidEqualTo(tcase.getIid());
                }
                if (StringUtils.isNotBlank(tcase.getRequestparam())) {
                    criteria2.andRequestparamLike("%" + tcase.getRequestparam() + "%");
                }
                if (tcase.getId() != null) {
                    criteria2.andIdEqualTo(tcase.getId());
                }
                if (StringUtils.isNotBlank(tcase.getCasename())) {
                    criteria2.andCasenameLike("%" + tcase.getCasename() + "%");
                }
                if (StringUtils.isNotBlank(tcase.getTestclass())) {
                    criteria2.andTestclassEqualTo(tcase.getTestclass());
                }
                if (StringUtils.isNotBlank(tcase.getAuthor())) {
                    criteria2.andAuthorLike("%" + tcase.getAuthor() + "%");
                }
                if (StringUtils.isNotBlank(tcase.getExpected())) {
                    criteria2.andExpectedLike("%" + tcase.getExpected() + "%");
                }
                if (StringUtils.isNotBlank(tcase.getRemark())) {
                    criteria2.andRemarkLike("%" + tcase.getRemark() + "%");
                }
                if (tcase.getAsserttype() != null) {
                    criteria2.andAsserttypeEqualTo(tcase.getAsserttype());
                }
            }
            if (tcase.getServiceid() != null) {
                criteria.andServiceidEqualTo(tcase.getServiceid());
            }
            if (tcase.getIid() != null) {
                criteria.andIidEqualTo(tcase.getIid());
            }
            if (StringUtils.isNotBlank(tcase.getRequestparam())) {
                criteria.andRequestparamLike("%" + tcase.getRequestparam() + "%");
            }
            if (tcase.getId() != null) {
                criteria.andIdEqualTo(tcase.getId());
            }
            if (StringUtils.isNotBlank(tcase.getCasename())) {
                criteria.andCasenameLike("%" + tcase.getCasename() + "%");
            }
            if (StringUtils.isNotBlank(tcase.getTestclass())) {
                criteria.andTestclassEqualTo(tcase.getTestclass());
            }
            if (StringUtils.isNotBlank(tcase.getAuthor())) {
                criteria.andAuthorEqualTo(tcase.getAuthor());
            }
            if (StringUtils.isNotBlank(tcase.getExpected())) {
                criteria.andExpectedLike("%" + tcase.getExpected() + "%");
            }
            if (StringUtils.isNotBlank(tcase.getRemark())) {
                criteria.andRemarkLike("%" + tcase.getRemark() + "%");
            }
            if (tcase.getAsserttype() != null) {
                criteria.andAsserttypeEqualTo(tcase.getAsserttype());
            }
        }
        if (criteria2 != null) {
            tcaseExample.or(criteria2);
        }
        return tcaseMapper.selectByExample(tcaseExample);
    }

    @Override
    public PageInfo<TcaseCustom> selectByContion(TcaseCustom tcaseCustom, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize, SortEnum.UPDATETIME.getValue() + "," + SortEnum.ID.getValue());
        List<TcaseCustom> tcaseCustomList = tcaseCustomMapper.selectByCondition(tcaseCustom);
        PageInfo<TcaseCustom> pageInfo = new PageInfo<>(tcaseCustomList);
        return pageInfo;
    }

    @Override
    public Integer statisticCase(Tcase tcase) {
        TcaseExample example = new TcaseExample();
        TcaseExample.Criteria criteria = example.createCriteria();
        criteria.andStatusGreaterThan(0);
        if (tcase != null) {
            if (tcase.getIid() != null) {
                criteria.andIidEqualTo(tcase.getIid());
            }
            if (tcase.getServiceid() != null) {
                criteria.andServiceidEqualTo(tcase.getServiceid());
            }
        }
        Long longCount = tcaseMapper.countByExample(example);
        return longCount.intValue();
    }

    @Override
    public List<String> selectCaseDesigners() {
        return tcaseCustomMapper.selectCaseDesigners();
    }


/*    @Override
    public RunOneResult runOne(Tcase tcase) {
        //准备数据

        Tenv tenv = tenvService.selectOne(tcase.getEnvid());
        Ti ti = tiService.selectOne(tcase.getIid());
        Integer serviceId = ti.getServiceid();
        Tservice tservice = tserviceService.selectOne(serviceId);

        Tservicedetail tservicedetail;
        Tservicedetail condition = new Tservicedetail();
        condition.setEnvid(tcase.getEnvid());
        condition.setServiceid(serviceId);
        List<Tservicedetail> tservicedetails = tservicedetailService.selectByCondition(condition);
        if (tservicedetails.size() == 0) {
            throw new HryException(StatusCodeEnum.NOT_FOUND, "服务=" + tservice.getServicekey() + "(" + tservice.getServicename() + ")" + ",环境=" + tenv.getEnvkey() + "(" + tenv.getRemark() + ")");
        } else {
            tservicedetail = tservicedetails.get(0);
        }

        String url = HttpTypeEnum.getValue(tservice.getHttptype()) + "://" + tservicedetail.getHostinfo() + ti.getIuri();
        String actualParam = ReplaceUtil.replaceBefore(tcase.getRequestparam(), tservicedetail.getDbinfo(), null);

        //发送http请求
        String actual = HryHttpClientUtil.send(url, ti.getIrequestmethod(), ti.getIcontenttype(), ti.getIparamtype(), actualParam);

        //断言结果
        //update by luqiwei ,现在断言直接抛出AssertionError,不再返回布尔值 2018/8/22
        *//* Boolean result = AssertUtil.supperAssert(tcase.getAsserttype(), tcase.getExpected(), actual, ti.getIresponsetype());*//*
        Boolean result = true;


        RunOneResult runOneResult = new RunOneResult();
        runOneResult.setAssertType(AssertTypeEnum.getValue(tcase.getAsserttype()));
        runOneResult.setContentType(ContentTypeEnum.getValue(ti.getIcontenttype()));
        runOneResult.setExpected(tcase.getExpected());
        runOneResult.setIUri(ti.getIuri());
        runOneResult.setParam(tcase.getRequestparam());
        runOneResult.setPrarmType(RequestParamTypeEnum.getValue(ti.getIparamtype()));
        runOneResult.setRequestMethod(RequestMethodTypeEnum.getValue(ti.getIrequestmethod()));
        runOneResult.setResponseType(ResponseTypeEnum.getValue(ti.getIresponsetype()));
        runOneResult.setServiceKey(tservice.getServicekey());


        List<RunOneResultSub> list = new ArrayList<>();
        RunOneResultSub runOneResultSub = new RunOneResultSub();
        runOneResultSub.setActualParam(actualParam);
        runOneResultSub.setActual(actual);
        runOneResultSub.setEnv(EnvEnum.getValue(tservicedetail.getEnvid()));
        runOneResultSub.setHostInfo(tservicedetail.getHostinfo());

        if (result) {
            runOneResultSub.setResult(AssertResultEnum.PASS);
        } else {
            runOneResultSub.setResult(AssertResultEnum.FAIL);
        }
        list.add(runOneResultSub);
        runOneResult.setRunOneResultSubList(list);

        return runOneResult;
    }

    @Override
    public RunOneResult runOne(Integer id) {
        Tcase tcase = tcaseMapper.selectByPrimaryKey(id);
        return this.runOne(tcase);
    }*/

    @Override
    public String runOne(Tcase tcase, Integer userId) {
        String testClassName = tcase.getTestclass();
        Ti ti = tiService.selectOne(tcase.getIid());
        Tservice tservice = tserviceService.selectOne(ti.getServiceid());
        Tenv tenv = tenvService.selectOne(tcase.getEnvid());

        //校验是否存在服务与环境映射
        Tservicedetail tservicedetail = tservicedetailService.selectOne(tservice.getId(), tenv.getId());
        if (tservicedetail == null) {
            throw new HryException(StatusCodeEnum.NO_SERVICE_ENV_MAP, "服务=" + tservice.getServicekey() + " , 环境=" + tenv.getEnvkey() + " 未配置映射");
        }

        User user = userService.selectOne(userId);
        String date = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss").format(LocalDateTime.now());
        String reportName = "r_uid" + userId + "_sid" + tservice.getId() + "_iid" + ti.getId() + "_" + date + ".html";

        String methodName = HryUtil.iUri2MethodName(ti.getIuri());
        Map<String, List<Tcase>> testCase = new HashMap<>();
        testCase.put(methodName, Arrays.asList(tcase));

        Map<String, String> initParam = HryUtil.install_S_Params(tservice.getId(), tenv.getId(), null, null, testCase);

        //如果没有指定测试类名,则使用默认的测试类来测试
        if (StringUtils.isBlank(testClassName)) {
            testClassName = tservice.getClassname();
        }
        String longClassname = PackageEnum.TEST.getPackageName() + "." + testClassName;

        //校验测试类存在并且包含此接口的测试方法
        try {
            Class<?> testClass = Class.forName(longClassname);
            testClass.getMethod(methodName, HryTest.class);
        } catch (ClassNotFoundException e) {
            throw new HryException(StatusCodeEnum.RUN_ERROR, "测试类不存在(" + longClassname + "),请联系管理员");
        } catch (NoSuchMethodException e) {
            throw new HryException(StatusCodeEnum.RUN_ERROR, "测试方法不存在(" + methodName + "),请联系管理员");
        }

        //定义一个测试类
        XmlClass xmlClass = new XmlClass(longClassname);

        //方法选择器
        XmlInclude include = new XmlInclude(methodName);
        xmlClass.setIncludedMethods(Arrays.asList(include));

        /**
         * 现在传入suite到runner运行,故将参数提到test中,因为测试类现在改成构造器接收参数,必须将参数设置到类的上层
         */
        //设置测试类初始化参数
        //xmlClass.setParameters(initParam);

        //构造待测试suite
        XmlSuite xmlSuite = new XmlSuite();
        xmlSuite.setName("AutoSuite");
        XmlTest xmlTest = new XmlTest(xmlSuite);
        xmlTest.setName(testClassName);
        xmlTest.setParameters(initParam);
        xmlTest.setClasses(Arrays.asList(xmlClass));

        //构造测试报告
        Treport treport = new Treport();
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(tservice.getServicekey());
        treport.setServicenames(jsonArray.toJSONString());
        treport.setStatus(StatusEnum.FIVE.getId());
        treport.setServiceids(JSON.toJSONString(Arrays.asList(tservice.getId())));
        treport.setReportpath(reportPath);
        treport.setReportname(resourcePathPattern + reportName);
        treport.setUserid(user.getId());
        treport.setUsername(user.getRealname());
        treport.setEnvid(tenv.getId());
        treport.setEnvkey(tenv.getEnvkey());
        treport.setCustomid(0);
        treport.setReporttype(1);
        treport.setCustomname(tcase.getCasename());
        Integer reportId = treportService.insertOne(treport);

        log.info("即将运行单条用例的测试:");
        log.info("启动测试类:" + longClassname);
        log.info("传给测试类的参数:" + initParam);

        runner.run(reportId, reportName, "", xmlSuite);
        return resourcePathPattern + reportName;

    }

    @Override
    public String runOne(Integer caseId, Integer userId) {
        Tcase tcase = this.selectOne(caseId);
        return this.runOne(tcase, userId);
    }


}
