package com.gugy.onlinux;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author GGY
 */
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
//@NacosPropertySource(dataId = "servers-one", autoRefreshed = true)
public class OnlinuxApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnlinuxApplication.class, args);
    }
}
