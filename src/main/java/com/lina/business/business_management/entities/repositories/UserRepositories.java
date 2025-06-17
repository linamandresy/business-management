package com.lina.business.business_management.entities.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lina.business.business_management.entities.Users;

public interface UserRepositories extends JpaRepository<Users,Long>{
    Optional<Users> findByUsername(String username);
}
