package com.dhimantalapatra.spring.security.demo;

import com.dhimantalapatra.spring.security.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String> {
    public Optional<User> findByUsername(String username);
}
