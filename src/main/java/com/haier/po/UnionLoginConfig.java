package com.haier.po;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description: 读取yml中配置的登录信息
 * @Author: luqiwei
 * @Date: 2018/9/5 11:07
 */
@Component
@ConfigurationProperties(prefix = "unionlogin")
@Data
public class UnionLoginConfig {
    private List<LoginInfoDetail> loginInfoDetails;
}
