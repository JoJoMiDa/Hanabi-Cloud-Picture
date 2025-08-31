package com.hanabi.hanabibackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@MapperScan("com.hanabi.hanabibackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
@SpringBootApplication
public class HanabiBackendApplication {

    public static void main(String[] args) {SpringApplication.run(HanabiBackendApplication.class, args);
    }

}
