package com.example.EJ2.Signature.domain.repositories;


import com.example.EJ2.Signature.domain.Entities.Estudiante_asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Estudiante_asignaturaRepo extends JpaRepository<Estudiante_asignatura, String> {
}
