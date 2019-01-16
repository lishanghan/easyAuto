package com.haier.enums;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/12/25 11:55
 */
public enum TriggerState {
    ACQUIRED("ACQUIRED", "即将到我", "默认情况下，调度线程一次会拉取未来30s、过去60s之间还未fire的1个trigger。随后将这些triggers的状态由WAITING改为ACQUIRED，并插入fired_triggers表"),
    WAITING("WAITING", "排队拿号", "等待下次触发"),
    EXECUTING("EXECUTING", "正在执行", "fire"),
    COMPLETE("COMPLETE", "已完成", "不再触发"),
    PAUSED("PAUSED", "已停止", "手动停止"),
    ERROR("ERROR", "异常", "异常捕获后的状态");
    private String state;
    private String stateCN;
    private String stateDesc;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateCN() {
        return stateCN;
    }

    public void setStateCN(String stateCN) {
        this.stateCN = stateCN;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }

    TriggerState(String state, String stateCN, String stateDesc) {

        this.state = state;
        this.stateCN = stateCN;
        this.stateDesc = stateDesc;
    }
}
