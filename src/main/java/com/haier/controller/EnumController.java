package com.haier.controller;

import com.haier.enums.*;
import com.haier.util.EnumUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/5/25 14:15
 */

@RestController
@RequestMapping("/enum")
public class EnumController {
    @GetMapping("/allEnum")
    public Map<String, List<Map<String, Object>>> getAllEnum() {
        Map<String, List<Map<String, Object>>> map = new LinkedHashMap<>();
        map.put(AssertTypeEnum.class.getSimpleName(), this.getAssertTypeEnum());
        map.put(ContentTypeEnum.class.getSimpleName(), this.getContentTypeEnum());
        /*map.put(EnvEnum.class.getSimpleName(), this.getEnvEnum());*/
        map.put(UserGroup.class.getSimpleName(), this.getGroupEnum());
        map.put(HttpTypeEnum.class.getSimpleName(), this.getHttpTypeEnum());
        map.put(RequestMethodTypeEnum.class.getSimpleName(), this.getRequestMethodTypeEnum());
        map.put(ResponseTypeEnum.class.getSimpleName(), this.getResponseTypeEnum());
        map.put(StatusCodeEnum.class.getSimpleName(), this.getStatusCodeEnum());
        map.put(ClientLevelEnum.class.getSimpleName(), this.getclientLevelEnum());
        map.put(StatusEnum.class.getSimpleName(), this.getStatusEnum());
        return map;
    }

    @GetMapping("/assertTypeEnum")
    public List<Map<String, Object>> getAssertTypeEnum() {
        return EnumUtil.getEnumList(AssertTypeEnum.values());
    }

    @GetMapping("/contentTypeEnum")
    public List<Map<String, Object>> getContentTypeEnum() {
        return EnumUtil.getEnumList(ContentTypeEnum.values());
    }

    @GetMapping("/dbTypeEnum")
    public DBTypeEnum[] getDbTypeEnum() {
        return DBTypeEnum.values();
    }

/*    @GetMapping("/envEnum")
    public List<Map<String, Object>> getEnvEnum() {
        return EnumUtil.getEnumList(EnvEnum.values());
    }*/

    @GetMapping("/httpTypeEnum")
    public List<Map<String, Object>> getHttpTypeEnum() {
        return EnumUtil.getEnumList(HttpTypeEnum.values());
    }

    @GetMapping("/groupEnum")
    public List<Map<String, Object>> getGroupEnum() {
        return EnumUtil.getEnumList(UserGroup.values());
    }

    @GetMapping("/requestMethodTypeEnum")
    public List<Map<String, Object>> getRequestMethodTypeEnum() {
        return EnumUtil.getEnumList(RequestMethodTypeEnum.values());
    }

    @GetMapping("/requestParamTypeEnum")
    public List<Map<String, Object>> getRequestParamTypeEnum() {
        return EnumUtil.getEnumList(RequestParamTypeEnum.values());
    }

    @GetMapping("/responseTypeEnum")
    public List<Map<String, Object>> getResponseTypeEnum() {
        return EnumUtil.getEnumList(ResponseTypeEnum.values());
    }

    @GetMapping("/statusCodeEnum")
    public List<Map<String, Object>> getStatusCodeEnum() {
        return EnumUtil.getEnumList(StatusCodeEnum.values());
    }

    @GetMapping("/clientLevelEnum")
    public List<Map<String, Object>> getclientLevelEnum() {
        return EnumUtil.getEnumList(ClientLevelEnum.values());
    }

    @GetMapping("/statusEnum")
    public List<Map<String, Object>> getStatusEnum() {
        return EnumUtil.getEnumList(StatusEnum.values());
    }

    @GetMapping("/replaceEnumExamples")
    public List<Map<String, Object>> getReplaceEnumExamples() {
        return EnumUtil.getEnumList(ReplaceRegexEnum.values());
    }

    @GetMapping("/triggerState")
    public List<Map<String, Object>> getTriggerState() {
        return EnumUtil.getEnumList(TriggerState.values());
    }
}
