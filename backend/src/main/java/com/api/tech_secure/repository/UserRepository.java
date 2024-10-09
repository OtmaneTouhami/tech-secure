package com.api.tech_secure.repository;

import com.api.tech_secure.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}