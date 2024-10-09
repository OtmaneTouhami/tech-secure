package com.api.tech_secure.repository;

import com.api.tech_secure.model.Module;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository<Module, Long> {
}