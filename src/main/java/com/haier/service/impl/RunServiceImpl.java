package com.haier.service.impl;

import com.haier.po.*;
import com.haier.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/6/26 16:24
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class RunServiceImpl implements RunService {
    @Autowired
    TserviceService tserviceService;
    @Autowired
    TenvService tenvService;
    @Autowired
    TservicedetailService tservicedetailService;
    @Autowired
    TiService tiService;
    @Autowired
    TcaseService tcaseService;

    @Override
    public Tservice getTservice(Integer serviceId) {
        return tserviceService.selectOne(serviceId);
    }

    @Override
    public Tservicedetail getTservicedetail(Integer serviceId, Integer envId) {
        Tservicedetail tservicedetail = new Tservicedetail();
        tservicedetail.setServiceid(serviceId);
        tservicedetail.setEnvid(envId);
        List<Tservicedetail> tservicedetailList = tservicedetailService.selectByCondition(tservicedetail);
        //正常情况有且只会返回一个tservicedetail,如果返回多个,则取第一个
        if (tservicedetailList != null && tservicedetailList.size() > 0) {
            return tservicedetailList.get(0);
        }
        return null;
    }

    @Override
    public Ti getTi(Integer serviceId, String iUri) {
        Ti ti = new Ti();
        ti.setServiceid(serviceId);
        ti.setIuri(iUri);
        List<Ti> tis = tiService.selectByCondition(ti);
        for (Ti i : tis) {
            if (i.getIuri().equals(iUri)) {
                return i;
            }
        }
        return null;
    }

    @Override
    public List<Tcase> getTcase(Integer iId, Integer envId, String caseDesigner) {
        Tcase tcase = new Tcase();
        tcase.setIid(iId);
        tcase.setEnvid(envId);
        tcase.setAuthor(caseDesigner);
        return tcaseService.selectByCondition(tcase);
    }
}
