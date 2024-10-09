package com.api.tech_secure.repository;

import com.api.tech_secure.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}