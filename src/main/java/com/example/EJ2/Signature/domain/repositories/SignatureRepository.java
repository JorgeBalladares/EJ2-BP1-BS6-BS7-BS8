package com.example.EJ2.Signature.domain.repositories;

import com.example.EJ2.Signature.domain.Entities.SignatureEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignatureRepository extends JpaRepository<SignatureEntity, String> {
}
