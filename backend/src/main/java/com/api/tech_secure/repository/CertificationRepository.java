package com.api.tech_secure.repository;

import com.api.tech_secure.model.Certification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificationRepository extends JpaRepository<Certification, Long> {
}