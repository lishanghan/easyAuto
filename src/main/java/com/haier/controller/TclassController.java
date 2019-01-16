package com.haier.controller;

import com.haier.enums.RegexEnum;
import com.haier.enums.StatusCodeEnum;
import com.haier.exception.HryException;
import com.haier.po.Tclass;
import com.haier.response.Result;
import com.haier.service.TclassService;
import com.haier.util.ReflectUtil;
import com.haier.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/8/6 9:05
 */
@RestController
@RequestMapping("/class")
public class TclassController {
    @Autowired
    TclassService service;

    /**
     * 插入数据,会做数据重复性校验
     */
    @PostMapping("/insertOne")
    public Result insertOne(Tclass tclass) {
        ReflectUtil.setInvalidFieldToNull(tclass, false);
        if (tclass == null || tclass.getClassname() == null || tclass.getSid() == null || tclass.getSkey() == null || tclass.getRemark() == null) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "类名,服务Key,服务id,测试类描述必填");
        }
        //类名校验
        if (!tclass.getClassname().matches(RegexEnum.CLASSNAME_REGEX.getRegex())) {
            throw new HryException(StatusCodeEnum.REGEX_ERROR, "类名必须符合规则:首字母须大写,其余部分只能由字母和数字组成!");
        }

        //数据重复性校验
        Tclass condition = new Tclass();
        condition.setStatus(1);
        condition.setClassname(tclass.getClassname());
        condition.setSid(tclass.getSid());
        List<Tclass> tclasses = service.selectByCondition(condition);
        if (tclasses.size() > 0) {
            throw new HryException(StatusCodeEnum.EXIST_RECORD, "类名:" + tclass.getClassname() + ",服务id:" + tclass.getSid());
        }

        return ResultUtil.success(service.insertOne(tclass));
    }

    /**
     * 更新数据,会做数据重复性校验
     */
    @PostMapping("/updateOne")
    public Result updateOne(Tclass tclass) {
        ReflectUtil.setInvalidFieldToNull(tclass, false);
        if (tclass == null || tclass.getId() == null) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "更新操作时,id必填");
        }

        //数据校验
        if (tclass.getClassname() != null) {
            //类名校验
            if (!tclass.getClassname().matches("[A-Z][a-zA-Z0-9]+")) {
                throw new HryException(StatusCodeEnum.REGEX_ERROR, "类名必须符合规则:首字母须大写,其余部分只能由字母和数字组成!");
            }

            //数据重复性校验
            Tclass condition = new Tclass();
            condition.setStatus(1);
            condition.setClassname(tclass.getClassname());
            List<Tclass> tclasses = service.selectByCondition(condition);
            if (tclasses.size() > 0) {//存在 多条记录,并且id还不是自己的id
                for (Tclass c : tclasses) {
                    if (!c.getId().equals(tclass.getId())) {
                        throw new HryException(StatusCodeEnum.EXIST_RECORD, "与id=" + c.getId() + "的类名重复,请确认!");
                    }
                }
            }
        }

        return ResultUtil.success(service.updateOne(tclass));
    }

    /**
     * 删除数据
     */
    @PostMapping("/deleteOne")
    public Result deleteOne(Integer id) {
        if (id == null || id == 0) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "删除操作,id必填");
        }
        return ResultUtil.success(service.deleteOne(id));
    }

    /**
     * 查询单条数据,返回Tclass对象
     */
    @PostMapping("/selectOne")
    public Result selectOne(Integer id) {
        if (id == null || id == 0) {
            throw new HryException(StatusCodeEnum.PARAMETER_ERROR, "selectOne,id必填");
        }
        return ResultUtil.success(service.selectOne(id));
    }

    /**
     * 按条件查询,返回List
     */
    @PostMapping("/selectList")
    public Result selectList(Tclass tclass) {
        return ResultUtil.success(service.selectByCondition(tclass));
    }

    /**
     * 按条件查询,返回PageInfo
     */
    @PostMapping("/selectByCondition")
    public Result selectByCondition(Tclass tclass, Integer pageNum, Integer pageSize) {
        return ResultUtil.success(service.selectByCondition(tclass, pageNum, pageSize));
    }


}
