package com.haier.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haier.enums.ClientLevelEnum;
import com.haier.enums.PackageEnum;
import com.haier.enums.SortEnum;
import com.haier.enums.StatusCodeEnum;
import com.haier.exception.HryException;
import com.haier.mapper.TcustomCustomMapper;
import com.haier.mapper.TcustomMapper;
import com.haier.po.*;
import com.haier.service.*;
import com.haier.testng.run.Runner;
import com.haier.util.HryUtil;
import com.haier.util.ReflectUtil;
import com.haier.vo.CustomVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/6/28 15:36
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
@Slf4j
public class TcustomServiceImpl implements TcustomService {
    @Autowired
    TcustomMapper tcustomMapper;

    @Autowired
    TcustomCustomMapper tcustomCustomMapper;
    @Autowired
    TserviceService tserviceService;

    @Autowired
    TreportService treportService;

    @Autowired
    TservicedetailService tservicedetailService;

    @Autowired
    TcustomdetailService tcustomdetailService;

    @Autowired
    Runner runner;

    @Override
    public Integer insertOne(Tcustom tcustom, List<Tcustomdetail> tcustomdetails) {
        tcustomMapper.insertSelective(tcustom);
        Integer customId = tcustom.getId();//获取插入的自增Id
        for (Tcustomdetail tcustomdetail : tcustomdetails) {
            tcustomdetail.setCustomid(customId);
        }
        tcustomdetailService.insertBatch(tcustomdetails);
        return customId;
    }

    @Override
    public Integer insertOne(CustomVO customVO) {
        List<Tcustomdetail> list = customVO.getTcustomdetails();
        return this.insertOne(customVO, list);
    }

    @Override
    public Integer updateOne(Tcustom tcustom) {
        return tcustomMapper.updateByPrimaryKeySelective(tcustom);
    }

    @Override
    public Integer updateOne(CustomVO customVO) {
        Tcustom tcustom = new Tcustom();
        ReflectUtil.cloneChildToParent(tcustom, customVO);
        /**
         *  更新tcustom信息
         */
        this.updateOne(tcustom);
        /**
         * 更新tcustomdetail信息
         */
        //先删除历史保存的tcustomdetail记录
        Tcustomdetail condition = new Tcustomdetail();
        condition.setCustomid(customVO.getId());
        tcustomdetailService.physicalDeleteByCondition(condition);

        //插入本次编辑的tcustomdetail记录
        List<Tcustomdetail> tcustomdetails = customVO.getTcustomdetails();
        tcustomdetailService.insertBatch(tcustomdetails);
        return customVO.getId();
    }

    @Override
    public Integer deleteOne(Integer id) {
        /**
         * 删除tcustom
         */
        Tcustom tcustom = new Tcustom();
        tcustom.setId(id);
        tcustom.setStatus(-1);
        this.updateOne(tcustom);
        /**
         * 删除tcustomdetail
         */
        Tcustomdetail tcustomdetail = new Tcustomdetail();
        tcustomdetail.setCustomid(id);
        //物理删除tcustomdetail表的记录
        tcustomdetailService.physicalDeleteByCondition(tcustomdetail);
        return id;
    }


    @Override
    public CustomVO selectOne(Integer id) {
        CustomVO vo = new CustomVO();
        Tcustom tcustom = tcustomMapper.selectByPrimaryKey(id);
        ReflectUtil.cloneParentToChild(tcustom, vo);

        List<Tcustomdetail> tcustomdetails = tcustomdetailService.selectByCondition(id);
        vo.setTcustomdetails(tcustomdetails);

        return vo;
    }

    @Override
    public List<Tcustom> selectTcustomList(Tcustom tcustom) {
        TcustomExample tcustomExample = new TcustomExample();
        TcustomExample.Criteria criteria = tcustomExample.createCriteria();
        tcustomExample.setOrderByClause(SortEnum.UPDATETIME.getValue() + "," + SortEnum.ID.getValue());
        criteria.andStatusGreaterThan(0);
        if (tcustom != null) {
            if (tcustom.getId() != null) {
                criteria.andIdEqualTo(tcustom.getId());
            }
            if (tcustom.getUserid() != null) {
                criteria.andUseridEqualTo(tcustom.getUserid());
            }
            if (StringUtils.isNotBlank(tcustom.getUsername())) {
                criteria.andUsernameEqualTo(tcustom.getUsername());
            }
            if (tcustom.getEnvid() != null) {
                criteria.andEnvidEqualTo(tcustom.getEnvid());
            }
            if (StringUtils.isNotBlank(tcustom.getCustomname())) {
                criteria.andCustomnameLike("%" + tcustom.getCustomname() + "%");
            }
        }
        return tcustomMapper.selectByExample(tcustomExample);
    }

    @Override
    public List<TcustomCustom> selectTcustomCustomList(Tcustom tcustom) {
        List<Tcustom> tcustoms = this.selectTcustomList(tcustom);
        List<TcustomCustom> tcustomCustoms = new ArrayList<>();
        for (Tcustom t : tcustoms) {
            TcustomCustom tcustomCustom = new TcustomCustom();
            ReflectUtil.cloneParentToChild(t, tcustomCustom);
            List<Tcustomdetail> tcustomdetails = tcustomdetailService.selectByCondition(t.getId(), ClientLevelEnum.SERVICE.getLevel());//只取clientLevel=1的数据
            tcustomCustom.setTcustomdetails(tcustomdetails);
            tcustomCustoms.add(tcustomCustom);
        }
        return tcustomCustoms;
    }

    @Override
    public PageInfo<TcustomCustom> selectTcustomCustomPageInfo(Tcustom tcustom, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Tcustom> tcustoms = this.selectTcustomList(tcustom);
        PageInfo pageInfo = new PageInfo(tcustoms);
        List<Integer> customIds = tcustoms.stream().map(Tcustom::getId).collect(Collectors.toList());
        if (customIds.size() == 0) {
            return pageInfo;
        }

        List<Tcustomdetail> tcustomdetails = tcustomdetailService.selectByCustomIds(customIds);
        Map<Integer, List<Tcustomdetail>> customId_customdetails = tcustomdetails.stream().collect(Collectors.groupingBy(Tcustomdetail::getCustomid));

        List<TcustomCustom> list = new ArrayList<>();
        for (Tcustom custom : tcustoms) {
            TcustomCustom t = new TcustomCustom();
            ReflectUtil.cloneParentToChild(custom, t);
            t.setTcustomdetails(customId_customdetails.get(custom.getId()));
            list.add(t);
        }
        pageInfo.setList(list);
        return pageInfo;
    }

    @Override
    public String run(Integer customId,Boolean isScheduler) {
        return this.run(customId, null,isScheduler);
    }

    @Override
    public String run(Integer customId, User executeUser,Boolean isScheduler) {
        CustomVO vo = this.selectOne(customId); //VO包含Tcustom 和 Tcustomdetail
        if (executeUser != null && executeUser.getId() != null && executeUser.getRealname() != null) {
            vo.setUserid(executeUser.getId());
            vo.setUsername(executeUser.getRealname());
        }
        //映射校验
        verify_Service_Env_Mapping(vo);
        //收集测试内容
        XmlSuite xmlSuite = collectSuite(vo);
        //预生成测试报告
        Treport treport = treportService.insertOne(vo,isScheduler);
        //运行测试,并且更新测试报告
        runner.run(treport.getId(), treport.getReportname(), vo.getCustomname(), xmlSuite);
        return treport.getReportname();
    }


    @Override
    public List<String> selectCustomUsers() {
        return tcustomCustomMapper.selectCustomUsers();
    }

    /**
     * 根据定制类型,将定制的所有内容,转换成至XmlSuite中
     *
     * @param vo
     * @return
     */
    public XmlSuite collectSuite(CustomVO vo) {

        XmlSuite suite = new XmlSuite();
        List<XmlTest> xmlTestList = new ArrayList<>();
        suite.setName("suite");

        List<Tcustomdetail> alls = vo.getTcustomdetails();
        Map<Integer, List<Tcustomdetail>> levelGroups = alls.stream().collect(Collectors.groupingBy(Tcustomdetail::getClientlevel));

        List<Tcustomdetail> ss = levelGroups.get(ClientLevelEnum.SERVICE.getLevel());
        List<Tcustomdetail> is = levelGroups.get(ClientLevelEnum.INTERFACE.getLevel());
        List<Tcustomdetail> cs = levelGroups.get(ClientLevelEnum.CASE.getLevel());

        Map<Integer, Tcustomdetail> sid_ss = ss.stream().collect(Collectors.toMap(Tcustomdetail::getClientid, p -> p));
        Map<Integer, List<Tcustomdetail>> sid_is = is == null ? null : is.stream().collect(Collectors.groupingBy(Tcustomdetail::getParentclientid));
        Map<Integer, List<Tcustomdetail>> iid_cs = cs == null ? null : cs.stream().collect(Collectors.groupingBy(Tcustomdetail::getParentclientid));

        Comparator<Tcustomdetail> priorityComp = Comparator.comparing(Tcustomdetail::getPriority).reversed();

        /**
         * 收集接口中的所有用例
         */
        BiConsumer<Tcustomdetail, Map<String, List<Integer>>> collectCase = (i, iName_cidList) -> {
            if (iid_cs != null) {
                List<Tcustomdetail> _cs = iid_cs.get(i.getClientid());//某个接口对应的用例的集合,用例按优先级排序
                if (_cs != null) {//此接口有用例
                    List<Integer> cidList = _cs.stream().sorted(priorityComp).map(Tcustomdetail::getClientid).collect(Collectors.toList());
                    String iName = HryUtil.iUri2MethodName(i.getClientname());
                    if (iName_cidList == null) {
                        iName_cidList = new HashMap<>();
                    }
                    iName_cidList.put(iName, cidList);
                }
            }
        };


        /**
         * 收集服务(顺序运行)
         */
        Consumer<Tcustomdetail> collectService = s -> {
            Map<String, List<Integer>> iName_cidList = new HashMap<>();
            //构建测试类,对应服务
            XmlClass xmlClass = new XmlClass();
            xmlClass.setName(PackageEnum.TEST.getPackageName() + "." + s.getClassname());

            //构建测试方法,对应接口
            List<Tcustomdetail> _is = sid_is.get(s.getClientid());
            List<XmlInclude> xmlIncludeList = new ArrayList<>();
            if (_is != null && _is.size() > 0) {//定制过接口
                _is.stream().forEach(i -> {
                    String methodName = HryUtil.iUri2MethodName(i.getClientname());
                    xmlIncludeList.add(new XmlInclude(methodName, 0 - i.getPriority()));
                    //收集测试用例
                    collectCase.accept(i, iName_cidList);
                });
            }
            if (xmlIncludeList.size() > 0) {
                xmlClass.setIncludedMethods(xmlIncludeList);
            }
            //收集测试类初始化参数
            Map<String, String> sParams = HryUtil.install_S_Params(s.getClientid(), vo.getEnvid(), null, iName_cidList, null);

            XmlTest xmlTest = new XmlTest(suite);

            xmlTest.setName(s.getClientname());
            xmlTest.setParameters(sParams);
            xmlTest.setXmlClasses(Arrays.asList(xmlClass));
            xmlTestList.add(xmlTest);
        };

        /**
         * 收集服务(交叉运行)
         */
        Consumer<Map<Integer, List<Tcustomdetail>>> collectIntersectService = m -> {//Map中仅有一个key(sid),一个value(iList)
            for (Map.Entry<Integer, List<Tcustomdetail>> entry : m.entrySet()) {
                Map<String, List<Integer>> iName_cidList = new HashMap<>();
                Tcustomdetail s = sid_ss.get(entry.getKey());
                XmlClass xmlClass = new XmlClass();
                xmlClass.setName(PackageEnum.TEST.getPackageName() + "." + s.getClassname());

                List<XmlInclude> xmlIncludeList = new ArrayList<>();

                List<Tcustomdetail> iList = entry.getValue();
                if (iList != null && iList.size() > 0) {
                    iList.forEach(i -> {
                        String methodName = HryUtil.iUri2MethodName(i.getClientname());
                        xmlIncludeList.add(new XmlInclude(methodName, 0 - i.getPriority()));
                        collectCase.accept(i, iName_cidList);
                    });
                }
                if (xmlIncludeList.size() > 0) {
                    xmlClass.setIncludedMethods(xmlIncludeList);
                }

                Map<String, String> sParams = HryUtil.install_S_Params(s.getClientid(), vo.getEnvid(), null, iName_cidList, null);
                XmlTest xmlTest = new XmlTest(suite);
                //同一个suite中不可存在相同的testName
                xmlTest.setName(s.getClientname() + "_" + UUID.randomUUID().toString().replaceAll("-", "").substring(0, 6));
                xmlTest.setParameters(sParams);
                xmlTest.setXmlClasses(Arrays.asList(xmlClass));
                xmlTestList.add(xmlTest);
                break;
            }
        };

        /**
         * iList:SELECT * FROM tcustomdetail t WHERE t.`customId`=? AND t.`clientLevel`=2 ORDER BY t.`priority` DESC;
         * 将同一个优先级的所有服务,所对应的所有接口,根据优先级,按照服务进行分组
         * 同一个服务所对应接口组中的优先级不与其余组中的优先级交叉
         */
        Function<List<Tcustomdetail>, List<Map<Integer, List<Tcustomdetail>>>> doGroup = iList -> {
            List<Map<Integer, List<Tcustomdetail>>> ret = new ArrayList();
            List<Tcustomdetail> list = null;
            for (int i = 0; i < iList.size(); i++) {
                Tcustomdetail pre = i == 0 ? null : iList.get(i - 1);
                Tcustomdetail current = iList.get(i);
                if (i == 0) {//第一项
                    list = new ArrayList<>();
                    list.add(current);

                } else if (i == iList.size() - 1) {//最后一次循环,最后一个接口
                    if (current.getParentclientid().equals(pre.getParentclientid())) {//最后一个接口的服务与上一个接口的服务相同 ,则添加进list,一起收集到map中
                        list.add(current);
                        Map<Integer, List<Tcustomdetail>> map = new HashMap<>();
                        map.put(list.get(0).getParentclientid(), list);
                        ret.add(map);
                    } else {//最后一个接口的服务与上一个接口的服务不相同,先收集上一个服务的接口,再将本接口收集
                        Map<Integer, List<Tcustomdetail>> map = new HashMap<>();
                        map.put(list.get(0).getParentclientid(), list);
                        ret.add(map);

                        Map<Integer, List<Tcustomdetail>> lastMap = new HashMap<>();
                        lastMap.put(current.getParentclientid(), Arrays.asList(current));
                        ret.add(lastMap);
                    }
                } else {//除去第一个接口和最后一个接口,中间部分
                    if (current.getParentclientid().equals(pre.getParentclientid())) {//如果当前接口与上一个接口的服务id相同,则将当前接口添加至list中
                        list.add(current);
                    } else {//如果当前接口与上一个接口的服务id不同,
                        //首先收集上一个服务的所有接口
                        Map<Integer, List<Tcustomdetail>> map = new HashMap<>();
                        map.put(list.get(0).getParentclientid(), ObjectUtils.clone(list));
                        ret.add(map);

                        //将当前接口添加至新list中
                        list = new ArrayList<>();
                        list.add(current);
                    }

                }
            }
            return ret;
        };


        /**
         * 顺序运行
         */
        if (vo.getIntersect().equals(0)) {
            ss.stream().sorted(priorityComp).forEach(collectService);
        }
        /**
         * 交叉运行
         */
        else if (vo.getIntersect().equals(1)) {
            Map<Integer, List<Tcustomdetail>> sPriority_sList = ss.stream().collect(Collectors.groupingBy(Tcustomdetail::getPriority));
            List<Integer> sPriorities = sPriority_sList.keySet().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            sPriorities.stream().forEach(sid -> {
                List<Tcustomdetail> sList = sPriority_sList.get(sid);//同一个优先级的所有服务的集合
                List<Integer> sids = sList.stream().map(Tcustomdetail::getClientid).collect(Collectors.toList());
                //获取此优先级服务的所有接口,并且按优先级进行排序
                List<Tcustomdetail> iList = is.stream().filter(i -> sids.contains(i.getParentclientid())).sorted(priorityComp.thenComparing(Tcustomdetail::getParentclientid)).collect(Collectors.toList());
                if (iList.size() == 0) {//只有服务,未定制接口
                    sList.stream().forEach(collectService);
                } else {//定制了接口,交叉测试
                    List<Map<Integer, List<Tcustomdetail>>> group = doGroup.apply(iList);
                    group.stream().forEach(collectIntersectService);
                }
            });
        }

        suite.setTests(xmlTestList);

        return suite;
    }

    /**
     * 校验此定制中需要测试的服务与之相对应的环境信息是否维护
     * @param vo
     */
    public void verify_Service_Env_Mapping(CustomVO vo) {
        if (vo == null) {
            throw new HryException(StatusCodeEnum.RUN_ERROR, "定制不存在");
        }

        List<Tcustomdetail> tcustomdetails = vo.getTcustomdetails();
        List<Tcustomdetail> customServices = tcustomdetails.stream().filter(tcustomdetail -> tcustomdetail.getClientlevel().equals(ClientLevelEnum.SERVICE.getLevel())).collect(Collectors.toList());
        //将定制的服务及环境转换为:(String)serviceId_envId,如"2_5"表示serviceId=2,envId=5
        List<String> custom_s_e = customServices.stream().map(tcustomdetail -> tcustomdetail.getClientid() + "_" + vo.getEnvid()).collect(Collectors.toList());

        List<TservicedetailCustom> s_e_s = tservicedetailService.selectByCondition(null);
        List<String> all_S_E_Mapping = s_e_s.stream().map(p -> p.getServiceid() + "_" + p.getEnvid()).collect(Collectors.toList());
        custom_s_e.stream().forEach(se -> {
            if (!all_S_E_Mapping.contains(se)) {
                String[] split = se.split("_");
                List<Tcustomdetail> s = customServices.stream().filter(aaa -> aaa.getClientid().toString().equals(split[0])).collect(Collectors.toList());
                throw new HryException(StatusCodeEnum.NO_SERVICE_ENV_MAP, "服务=" + s.get(0).getClientname() + " , 环境=" + vo.getEnvkey() + " 未配置映射");
            }
        });
    }
}
