package com.example.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){ // 메소드 이름은 상관없다. 리턴타입이 BCryptPasswordEncoder 이면 된다.
        // (UserServiceImpl에서 BCryptPasswordEncoder를 사용하기 때문에 BCryptPasswordEncoder타입을 리턴함
        return new BCryptPasswordEncoder();
    }

}
