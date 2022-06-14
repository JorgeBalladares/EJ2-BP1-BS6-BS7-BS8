package com.example.EJ2.Profesor.Domain.repositories;

import com.example.EJ2.Profesor.Domain.Entities.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, String> {

}
