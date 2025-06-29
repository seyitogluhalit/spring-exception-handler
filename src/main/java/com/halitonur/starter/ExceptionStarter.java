package com.halitonur.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EntityScan(basePackages = {"com.halitonur"})
@EnableJpaRepositories(basePackages = {"com.halitonur"})
@ComponentScan(basePackages = {"com.halitonur"})
@EnableScheduling
public class ExceptionStarter {
    public static void main(String[] args) {
        SpringApplication.run(ExceptionStarter.class, args);
    }
}

