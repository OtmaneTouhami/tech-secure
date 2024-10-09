package com.api.tech_secure.repository;

import com.api.tech_secure.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}