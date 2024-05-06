package com.aliyun.oss;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AliOSSProperties.class)//将AliOSSProperties这个类交给IOC容器管理
public class AliOSSAutoConfiguration {
    @Bean
    public AliOSSUtils aliOSSUtils(AliOSSProperties aliOSSProperties){ //注入
        AliOSSUtils aliOSSUtils = new AliOSSUtils();
        aliOSSUtils.setAliOSSProperties(aliOSSProperties);

        return aliOSSUtils;
    }
}
