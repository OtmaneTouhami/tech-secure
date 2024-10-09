package com.api.tech_secure.repository;

import com.api.tech_secure.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
}