package com.haier.enums;


/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/6/6 16:11
 */
public enum DBTypeEnum {
    MYSQL("com.mysql.jdbc.Driver"),
    ORACLE("oracle.jdbc.driver.OracleDriver"),
    DB2("com.ibm.db2.jcc.DB2Driver");


    private String driverName;


    DBTypeEnum(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
}
