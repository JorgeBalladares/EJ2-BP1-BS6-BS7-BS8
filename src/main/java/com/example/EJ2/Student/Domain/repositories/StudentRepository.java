package com.example.EJ2.Student.Domain.repositories;

import com.example.EJ2.Student.Domain.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {



}
