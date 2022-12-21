package com.patel.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.patel.spring.Bean.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
