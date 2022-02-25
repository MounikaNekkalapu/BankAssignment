package com.coforge.microservices.Customersservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.microservices.Customersservice.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}
