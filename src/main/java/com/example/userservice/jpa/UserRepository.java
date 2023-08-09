package com.example.userservice.jpa;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findByUserId(String userId); //데이터베이스 Entity 클래스, 기본키의 클래스
    UserEntity findByEmail(String username);

}
