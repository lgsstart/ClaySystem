package com.mcylm.clay.service.consoleservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Mr_Shen on 2017/8/7/007.
 */
@SpringBootApplication(scanBasePackages = "com.mcylm.clay.service.consoleservice.*")
@MapperScan({"com.mcylm.clay.service.consoleservice.mapper.*"})
@EnableEurekaClient
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}