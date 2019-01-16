package com.haier.controller;


import com.haier.enums.StatusCodeEnum;
import com.haier.exception.HryException;
import com.haier.po.Tenv;
import com.haier.response.Result;
import com.haier.service.TenvService;
import com.haier.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @Description: 环境维护
 * @Author: luqiwei
 * @Date: 2018/5/8 20:26
 */
@Slf4j
@RestController
@RequestMapping("/tenv")
public class TenvController {
    @Autowired
    TenvService tenvService;

    @PostMapping(value = "/selectAll")
    public Result selectAll() {
        return ResultUtil.success(tenvService.selectAll());
    }

    @PostMapping(value = "/selectOne")
    public Result selectOne(Integer id) {
        return ResultUtil.success(tenvService.selectOne(id));
    }

    @PostMapping(value = "/insertOne")
    public Result insertOne(@Validated Tenv tenv) {
        List<Tenv> tenvs = tenvService.selectAll();
        if (tenvs.size() > 0) {
            for (Tenv t : tenvs) {
                if (tenv.getEnvkey().equals(t.getEnvkey())) {
                    throw new HryException(StatusCodeEnum.EXIST_RECORD, "环境标识envkey必须唯一");
                }
            }
        }
        return ResultUtil.success(tenvService.insertOne(tenv));
    }

    @PostMapping(value = "/deleteOne")
    public Result deleteOne(Integer id) {
        return ResultUtil.success(tenvService.deleteOne(id));
    }

    @PostMapping(value = "/updateOne")
    public Result updateOne(@Validated Tenv tenv) {
        List<Tenv> tenvs = tenvService.selectAll();
        if (tenvs.size() > 0) {
            for (Tenv t : tenvs) {
                if (tenv.getId() != null && t.getEnvkey().equals(tenv.getEnvkey()) && !t.getId().equals(tenv.getId())) {
                    throw new HryException(StatusCodeEnum.EXIST_RECORD, "环境标识envkey必须唯一");
                }
            }
        }
        return ResultUtil.success(tenvService.updateOne(tenv));
    }


}
