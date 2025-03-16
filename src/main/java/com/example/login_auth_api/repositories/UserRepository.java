package com.example.login_auth_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.login_auth_api.domain.user.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);

}
