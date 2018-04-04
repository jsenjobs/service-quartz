package com.jsen.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 * </p>
 *
 * @author ${User}
 * @since 2018/4/3
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Boot {
    public static void main(String[] args) {
        SpringApplication.run(Boot.class, args);
    }
}
