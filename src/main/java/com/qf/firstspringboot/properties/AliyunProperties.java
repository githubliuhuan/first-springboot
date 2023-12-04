package com.qf.firstspringboot.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author haun
 * @version 1.0.0
 * @date 2023/12/3 13:16
 */

@ConfigurationProperties(prefix = "aliyun")
@Component
@Data
public class AliyunProperties {
    private String xxxx;
    private String yyyy;
    private String zzzz;
    private String aaaa;
    private String bbbb;
}
