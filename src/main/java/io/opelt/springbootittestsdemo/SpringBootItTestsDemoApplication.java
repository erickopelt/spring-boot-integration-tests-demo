package io.opelt.springbootittestsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootItTestsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootItTestsDemoApplication.class, args);
    }

}
