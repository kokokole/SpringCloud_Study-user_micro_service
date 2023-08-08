package com.example.userservice.vo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Greeting {

    @Value("${greeting.message}") // yml에서 greeting.message값을 가져옴 그냥 String 값을 넣으면 그 값이 저장됨
    private String message;
}
