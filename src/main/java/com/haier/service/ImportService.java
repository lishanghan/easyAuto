package com.haier.service;

import com.alibaba.fastjson.JSONObject;
import com.haier.po.ImportInterfaceResult;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/5/18 19:35
 */
public interface ImportService {
    ImportInterfaceResult importInterface(Integer serviceId, JSONObject jsonObject, Boolean overwrite,Boolean isDelete, String dev);

    ImportInterfaceResult importInterface(Integer serviceId, Integer envId, JSONObject postmanJson, Boolean overwriteI, Boolean overwriteC, String dev,String cAuthor);
}
