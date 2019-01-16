package com.haier.po;

import lombok.Data;

import java.util.List;

/**
 * @Description: 导入结果描述类
 * @Author: luqiwei
 * @Date: 2018/5/19 14:07
 */
@Data
public class ImportInterfaceResult {
    private Integer serviceId;//服务ID,tservice.id
    private String serviceKey;//tservice.servicekey
    private String serviceName;
    private Integer totalCount;//总共解析到多少个接口
    private Integer insertCount;//插入多个个接口
    private List<String> insertList;
    private Integer updateCount;//更新的接口数,如果overwrite为false,则不会更新
    private List<String> updateList;
    private Integer failCount;//失败总数
    private List<String> failList;//失败接口uri集合
    private Integer deleteCount;
    private List<String> deleteList;

}
