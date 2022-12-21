package com.patel.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patel.user.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long>{

	User findByUserId(Long userId);

}
