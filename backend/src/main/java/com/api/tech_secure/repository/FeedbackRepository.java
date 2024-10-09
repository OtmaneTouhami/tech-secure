package com.api.tech_secure.repository;

import com.api.tech_secure.model.Feedback;
import com.api.tech_secure.model.FeedbackKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, FeedbackKey> {
}