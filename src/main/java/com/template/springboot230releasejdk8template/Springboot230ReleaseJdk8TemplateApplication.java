package com.template.springboot230releasejdk8template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@EnableTransactionManagement
public class Springboot230ReleaseJdk8TemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot230ReleaseJdk8TemplateApplication.class, args);
    }

}
