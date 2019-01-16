package com.haier.controller;

import com.haier.enums.ClientLevelEnum;
import com.haier.enums.StatusCodeEnum;
import com.haier.exception.HryException;
import com.haier.po.Tcustom;
import com.haier.po.Tcustomdetail;
import com.haier.po.User;
import com.haier.response.Result;
import com.haier.service.TcustomService;
import com.haier.util.ResultUtil;
import com.haier.vo.CustomVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/6/28 16:05
 */
@Slf4j
@RestController
@RequestMapping("/tcustom")
public class TcustomController {
    @Autowired
    TcustomService tcustomService;

    @PostMapping("/insertOne")
    public Result insertOne(@RequestBody CustomVO customVO) {
        if (customVO == null || customVO.getCustomname() == null || customVO.getUserid() == null || customVO.getEnvid() == null
                || customVO.getTcustomdetails() == null || customVO.getTcustomdetails().size() == 0) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "定制名称,定制环境,定制人,定制明细必填!");
        }
        List<Tcustomdetail> list = customVO.getTcustomdetails();

        for (Tcustomdetail tcustomdetail : list) {
            verifyTcustomdetail(tcustomdetail);
        }
        /**
         * 交叉运行校验,
         */
        verifyIntersect(customVO);

        return ResultUtil.success(tcustomService.insertOne(customVO));
    }

    public void verifyIntersect(CustomVO customVO) {
        List<Tcustomdetail> list = customVO.getTcustomdetails();
        if (customVO.getIntersect().intValue() == 1) {
            /**
             * 1.1服务至少两个,并且至少有一组服务的优先级相同(服务优先级相同,才能交叉测试接口)
             * 1.2至少有一个优先级对应的服务数>=2
             */
            List<Tcustomdetail> ss = list.stream()
                    .filter(p -> p.getClientlevel().equals(ClientLevelEnum.SERVICE.getLevel())).collect(Collectors.toList());
            if (ss.size() < 2) {
                throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "运行方式为[交叉]时,至少选择两个服务");
            }
            Map<Integer, Long> collect = ss.stream().collect(Collectors.groupingBy(Tcustomdetail::getPriority, Collectors.counting()));
            Long aLong = collect.values().stream().max(Comparator.naturalOrder()).get();//按优先级分组后,计数最大的数
            if (aLong < 2) {
                throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "运行方式为[交叉]时,至少需要有一个优先级对应的服务数大于或等于2");
            }

            /**
             * 2.1交叉运行的服务,必须都有选择接口
             * 2.2交叉运行的服务,所有选择的接口,优先级不可重复(都为0时除外)
             */
            for (Integer priority : collect.keySet()) {
                if (collect.get(priority) >= 2) {//对于同一个优先级对应 多个服务的情况 ,需要对服务进行是否选择接口的校验
                    List<Tcustomdetail> samePriority_ss = ss.stream().filter(p0 -> p0.getPriority().equals(priority)).collect(Collectors.toList());
                    samePriority_ss.stream().filter(ps -> ps.getPriority().equals(priority)).forEach(ps -> {
                        if (!ps.getHaschild()) {
                            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "运行方式为[交叉]时,同优先级的所有服务中都必须选择至少一个接口");
                        }
                    });

                    List<Integer> sids = samePriority_ss.stream().map(Tcustomdetail::getClientid).collect(Collectors.toList());
                    Map<Integer, Long> collect1 = list.stream()
                            .filter(pi -> pi.getClientlevel().equals(ClientLevelEnum.INTERFACE.getLevel()) && sids.contains(pi.getParentclientid()))//过滤此优先级的所有服务对应的所有接口
                            .collect(Collectors.groupingBy(Tcustomdetail::getPriority, Collectors.counting()));//按接口的优先级分组并计数
                    for (Map.Entry<Integer, Long> entry : collect1.entrySet()) {
                        Integer i_priotity = entry.getKey();
                        Long i_count = entry.getValue();
                        if (i_priotity.intValue() != 0 && i_count > 1) {
                            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "运行方式为[交叉]时,同优先级服务中的所有接口的优先级不可重复(接口优先级为0时除外)");
                        }
                    }
                }
            }
        }
    }

    @PostMapping("/updateOne")
    public Result updateOne(@RequestBody CustomVO customVO) {
        if (customVO == null || customVO.getId() == null || customVO.getTcustomdetails() == null || customVO.getTcustomdetails().size() == 0) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "更新定制时,定制id,定制明细不可为空!");
        }
        List<Tcustomdetail> list = customVO.getTcustomdetails();
        for (Tcustomdetail tcustomdetail : list) {
            verifyTcustomdetail(tcustomdetail);
            tcustomdetail.setCustomid(customVO.getId());
        }
        /**
         * 交叉运行校验,
         */
        verifyIntersect(customVO);
        return ResultUtil.success(tcustomService.updateOne(customVO));
    }

    @PostMapping("/deleteOne")
    public Result deleteOne(@RequestBody Map<String, Integer> map) {
        Integer id = map.get("id");
        if (id == null) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "删除定制信息时id必填!");
        }
        return ResultUtil.success(tcustomService.deleteOne(id));
    }

    @PostMapping("/selectOne")
    public Result selectOne(@RequestBody Map<String, Integer> map) {
        Integer id = map.get("id");
        return ResultUtil.success(tcustomService.selectOne(id));
    }

    @PostMapping("/selectByCondition")
    public Result selectByCondition(Tcustom tcustom) {
        return ResultUtil.success(tcustomService.selectTcustomList(tcustom));
    }

    @PostMapping("/selectTcustomCustomByCondition")
    public Result selectTcustomCustomByCondition(Tcustom tcustom) {
        return ResultUtil.success(tcustomService.selectTcustomCustomList(tcustom));
    }

    @PostMapping("/selectTcustomCustomPageInfo")
    public Result selectTcustomCustomPageInfo(Tcustom tcustom, Integer pageNum, Integer pageSize) {
        if (pageNum == null || pageSize == null) {
            pageNum = 1;
            pageSize = 10;
        }
        return ResultUtil.success(tcustomService.selectTcustomCustomPageInfo(tcustom, pageNum, pageSize));
    }

    @PostMapping("/runByTcustomId")
    public Result runByTcustomId(Integer customId, User user) {
        if (customId == null || customId == 0) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "运行定制测试时,定制测试id必填!");
        }
        return ResultUtil.success(tcustomService.run(customId, user, false));
    }

    public void verifyTcustomdetail(Tcustomdetail tcustomdetail) {
        //必填校验
        if (tcustomdetail.getClientlevel() == null || tcustomdetail.getClientid() == null || StringUtils.isBlank(tcustomdetail.getClientname())) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "定制明细中,clientLevel,clientId,clientName必填");
        }
        if (tcustomdetail.getClientlevel().equals(ClientLevelEnum.SERVICE.getLevel()) && StringUtils.isBlank(tcustomdetail.getClassname())) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, tcustomdetail.getClientname() + "服务未指定测试类");
        }
        //当定制明细为接口和用例时,需要校验parentClientId不为0或者null
        if (!tcustomdetail.getClientlevel().equals(ClientLevelEnum.SERVICE.getLevel()) && tcustomdetail.getParentclientid() == null) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "定制明细中,定制接口和用例时parentClientId必填");
        }
        //如果未指定父级ID,则默认0
        if (tcustomdetail.getParentclientid() == null) {
            tcustomdetail.setParentclientid(0);
        }
        //如果没有指定优化级,则默认0(最低)
        if (tcustomdetail.getPriority() == null) {
            tcustomdetail.setPriority(0);
        } else if (tcustomdetail.getPriority() < 0) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "优先级必须>=0");
        }
    }
}
