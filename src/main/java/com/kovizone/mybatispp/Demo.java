package com.kovizone.mybatispp;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Demo1
 *
 * @author KV
 * @since 2022/10/18
 */
@RequiredArgsConstructor
@SpringBootApplication
class Demo implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Demo.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello world!");
    }
}
