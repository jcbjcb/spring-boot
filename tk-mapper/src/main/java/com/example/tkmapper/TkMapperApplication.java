package com.example.tkmapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.example.tkmapper.mapper")
@SpringBootApplication
public class TkMapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(TkMapperApplication.class, args);
    }

}
