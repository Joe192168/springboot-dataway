package com.joe;

import net.hasor.spring.boot.EnableHasor;
import net.hasor.spring.boot.EnableHasorWeb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableHasor
@EnableHasorWeb
@SpringBootApplication
public class DataWayApp {

    public static void main(String[] args) {
        SpringApplication.run(DataWayApp.class, args);
    }

}
