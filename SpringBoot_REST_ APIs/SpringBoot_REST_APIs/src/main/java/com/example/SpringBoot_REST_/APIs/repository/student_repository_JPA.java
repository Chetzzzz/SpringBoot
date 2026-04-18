package com.example.SpringBoot_REST_.APIs.repository;

import com.example.SpringBoot_REST_.APIs.model.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface student_repository_JPA extends JpaRepository<student,Long> {
}
