package cn.exrick.sso.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:mybatis/*.xml", "classpath:spring/*.xml"})
public class SsoServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SsoServiceApplication.class, args);
    }
}
