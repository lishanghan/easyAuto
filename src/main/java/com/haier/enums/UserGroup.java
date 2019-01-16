package com.haier.enums;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/6/4 12:19
 */
public enum UserGroup {
    NULL(-1, "未分组"),
    ADMIN(1, "超级管理员"),
    SCHEDULER(2,"scheduler"),
    /**
     * 2-10为系统预留,
     */

    //上海分组
    TESTER(11, "测试组"),
    DEVER(12, "开发组"),// 如果后续需要扩展多个开发组,可以120,121,122...
    PRODUCT_UED(13, "产品及UED"),
    PM(14, "项目经理"),
    OP(15, "运维"),

    BOSS(9999, "boss");
    private Integer groupId;
    private String desc;

    UserGroup(Integer groupId, String desc) {
        this.groupId = groupId;
        this.desc = desc;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public String getDesc() {
        return desc;
    }
}
