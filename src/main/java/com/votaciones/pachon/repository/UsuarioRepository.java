package com.votaciones.pachon.repository;

import com.votaciones.pachon.dto.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, String> {
}
