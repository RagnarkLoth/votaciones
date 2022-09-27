package com.votaciones.pachon.repository;

import com.votaciones.pachon.dto.CandidatosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatoRepository extends JpaRepository<CandidatosEntity, Long> {
}
