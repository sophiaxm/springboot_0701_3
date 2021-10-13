package com.kgc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/myconfig/myconfig.properties")
public class Springboot0701Application {

    public static void main(String[] args) {

        SpringApplication.run(Springboot0701Application.class, args);
    }

}
