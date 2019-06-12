package com.ssf.mysqloracletest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ssf.mysqloracletest.mapper")
public class MysqlOracleTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysqlOracleTestApplication.class, args);
    }

}
