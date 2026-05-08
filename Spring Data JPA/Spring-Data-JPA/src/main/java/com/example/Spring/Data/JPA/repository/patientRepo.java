package com.example.Spring.Data.JPA.repository;

import com.example.Spring.Data.JPA.entity.patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface patientRepo extends JpaRepository<patient, Long> {

}
