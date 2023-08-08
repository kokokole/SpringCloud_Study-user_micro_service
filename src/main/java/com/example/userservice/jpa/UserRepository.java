package com.example.userservice.jpa;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> { //데이터베이스 Entity 클래스, 기본키의 클래스


}
