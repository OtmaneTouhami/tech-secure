package com.api.tech_secure.repository;

import com.api.tech_secure.model.TestAttempt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestAttemptRepository extends JpaRepository<TestAttempt, Long> {
}