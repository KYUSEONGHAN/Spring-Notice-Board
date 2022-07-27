package com.example.springnoticeboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;

@SpringBootApplication
public class SpringNoticeBoardApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringNoticeBoardApplication.class, args);
    }
}
