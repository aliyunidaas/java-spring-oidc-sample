package com.aliyunidaas.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @see "https://codetinkering.com/spring-security-oauth2-oidc/"
 * @see "https://github.com/code-tinkering/spring-boot-oauth2-oidc-example"
 */

@SpringBootApplication(scanBasePackages = "com.aliyunidaas.sample")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}