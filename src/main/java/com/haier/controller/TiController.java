package com.haier.controller;


import com.haier.enums.RegexEnum;
import com.haier.enums.StatusCodeEnum;
import com.haier.exception.HryException;
import com.haier.po.Ti;
import com.haier.po.TiCustom;
import com.haier.response.Result;
import com.haier.service.TiService;
import com.haier.util.JSONUtil;
import com.haier.util.ResultUtil;
import com.haier.vo.TiWithCaseVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/5/24 10:26
 */
@Slf4j
@RestController
@RequestMapping("/ti")
public class TiController {
    @Autowired
    TiService tiService;

    /**
     * 添加接口
     */
    @PostMapping("/insertOne")
    public Result insertOne(@Validated Ti ti) {
        if (!ti.getIuri().matches(RegexEnum.NOTBLANK.getRegex())) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "接口地址不可包含空字符(空格,tab,回车符,换行符)");
        }

        verifyIHeaderAndIParam(ti);
        //数据重复性校验
        Ti condition = new Ti();
        condition.setIuri(ti.getIuri());
        condition.setServiceid(ti.getServiceid());
        List<Ti> tis = tiService.selectByCondition(condition);
        for (Ti t : tis) {
            if (t.getServiceid().equals(ti.getServiceid()) && t.getIuri().equals(ti.getIuri())) {
                throw new HryException(StatusCodeEnum.EXIST_RECORD);
            }
        }

        return ResultUtil.success(tiService.insertOne(ti));
    }

    /**
     * 查询单个接口信息,参数-接口id
     */
    @PostMapping("/selectOne")
    public Result selectOne(Integer id) {
        return ResultUtil.success(tiService.selectOne(id));
    }


    /**
     * 查询所有接口(status>0),返回接口包装对象(tiCustom)列表,带分页信息
     */
    @PostMapping("/selectByCondition")
    public Result selectByCondition(TiCustom tiCustom, Integer pageNum, Integer pageSize) {
        if (pageNum == null || pageSize == null) {
            pageNum = 1;
            pageSize = 10;
        }
        return ResultUtil.success(tiService.selectByCondition(tiCustom, pageNum, pageSize));
    }

    /**
     * 返回List<ti> 带返回状态
     *
     * @param ti
     * @return
     */
    @PostMapping("/selectByConditionSimple")
    public Result selectByConditionSimple(Ti ti) {
        return ResultUtil.success(tiService.selectByCondition(ti));
    }

    /**
     * 返回List<ti> 不带返回状态,返回纯List
     *
     * @param ti
     * @return
     */
    @PostMapping("/selectList")
    public List<Ti> selectList(Ti ti) {
        return tiService.selectByCondition(ti);
    }

    /**
     * ti-tcase vo,带返回状态
     *
     * @param ti
     * @return
     */
    @PostMapping("/selectTiWithCaseVO")
    public Result selectTiWithCaseVO(Ti ti) {
        return ResultUtil.success(this.selectListTiWithTcaseVO(ti));
    }

    /**
     * ti-tcase vo,不带返回状态,纯List返回
     *
     * @param ti
     * @return
     */
    @PostMapping("/selectListTiWithCaseVO")
    public List<TiWithCaseVO> selectListTiWithTcaseVO(Ti ti) {
        if (ti == null || ti.getServiceid() == null) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "至少需要serviceid作为查询条件");
        }
        return tiService.selectTiWithCaseVO(ti);
    }

    /**
     * 更新接口,接口id必填
     *
     * @param ti
     * @return
     */
    @PostMapping("updateOne")
    public Result updateOne(@Validated Ti ti) {
        if (!ti.getIuri().matches(RegexEnum.NOTBLANK.getRegex())) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "接口地址不可包含空字符(空格,tab,回车符,换行符)");
        }

        verifyIHeaderAndIParam(ti);
        //数据重复性校验
        Ti condition = null;
        if (ti.getServiceid() != null || ti.getIuri() != null) {
            condition = new Ti();
            if (ti.getServiceid() != null) {
                condition.setServiceid(ti.getServiceid());
            }
            if (ti.getIuri() != null) {
                condition.setIuri(ti.getIuri());
            }
        }
        if (condition != null) {
            List<Ti> tis = tiService.selectByCondition(condition);
            Ti self = tiService.selectOne(ti.getId());
            for (Ti i : tis) {
                if (!i.getId().equals(self.getId())//id不相等
                        && i.getServiceid().equals(ti.getServiceid() == null ? self.getServiceid() : ti.getServiceid())//服务相等
                        && i.getIuri().equals(ti.getIuri() == null ? self.getIuri() : ti.getIuri())//iUri相等
                        ) {
                    throw new HryException(StatusCodeEnum.EXIST_RECORD, "重复记录id=" + i.getId());
                }
            }

        }
        return ResultUtil.success(tiService.updateOne(ti));
    }

    public void verifyIHeaderAndIParam(Ti ti) {
        if (StringUtils.isNotBlank(ti.getIheadersample())) {
            String formatedHeader = JSONUtil.verify(ti.getIheadersample());
            if (formatedHeader != null) {
                ti.setIheadersample(formatedHeader);
            } else {
                throw new HryException(StatusCodeEnum.PARSE_JSON_ERROR, "示例Header只可填写JSON格式");
            }
        }
        if (ti.getIparamtype() != null && ti.getIparamtype() == 1 && StringUtils.isNotBlank(ti.getIparamsample())) {
            String formatedSample = JSONUtil.verify(ti.getIparamsample());
            if (formatedSample != null) {
                ti.setIparamsample(formatedSample);
            } else {
                throw new HryException(StatusCodeEnum.PARSE_JSON_ERROR, "当请求参数类型为JSON时,请求参数示例必须符合JSON格式");
            }
        }
    }


    /**
     * 删除接口,将接口状态设置为-1
     *
     * @param id
     * @return
     */
    @PostMapping("/deleteOne")
    public Result deleteOne(Integer id) {
        return ResultUtil.success(tiService.deleteOne(id));
    }

    /**
     * 作废接口,将接口状态设置为-2
     *
     * @param id
     * @return
     */
    @PostMapping("/invalidInterface")
    public Result invalidInterface(Integer id) {
        return ResultUtil.success(tiService.invalidInterface(id));
    }

    /**
     * 根据条件删除ti表中的记录,
     * 支持根据serviceid批量删除接口
     *
     * @param ti
     * @return
     */
    @PostMapping("/deleteByCondition")
    public Result deleteByCondition(Ti ti) {

        return ResultUtil.success(tiService.deleteByCondition(ti));
    }
}
