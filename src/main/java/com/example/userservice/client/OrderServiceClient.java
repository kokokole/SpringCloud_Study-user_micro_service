package com.example.userservice.client;

import com.example.userservice.vo.ResponseOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "order-service") // 호출하고자하는 서비스의 이름
public interface OrderServiceClient {

    @GetMapping("order-service/{userId}/orders") // 호출하고자하는 order service의 endpoint // orders_ng라는 잘못된 주소로 설정되었을 경우 발생하는 예외처리
    List<ResponseOrder> getOrders(@PathVariable String userId);
}
