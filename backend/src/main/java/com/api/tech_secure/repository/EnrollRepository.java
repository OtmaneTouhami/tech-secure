package com.api.tech_secure.repository;

import com.api.tech_secure.model.Enroll;
import com.api.tech_secure.model.EnrollKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollRepository extends JpaRepository<Enroll, EnrollKey> {
}