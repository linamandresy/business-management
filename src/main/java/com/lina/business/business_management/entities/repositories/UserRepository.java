package com.lina.business.business_management.entities.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lina.business.business_management.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{
    Optional<User> findByUsername(String username);
}
