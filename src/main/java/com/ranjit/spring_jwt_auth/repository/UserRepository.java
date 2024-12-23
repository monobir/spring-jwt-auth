package com.ranjit.spring_jwt_auth.repository;

import com.ranjit.spring_jwt_auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
