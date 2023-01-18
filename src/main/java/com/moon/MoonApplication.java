package com.moon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoonApplication {

    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(MoonApplication.class);
        springApplication.addListeners(new ApplicationStartListener());
        SpringApplication.run(MoonApplication.class, args);
        springApplication.run(args);
    }

}
