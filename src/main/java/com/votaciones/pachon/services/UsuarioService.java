package com.votaciones.pachon.services;

import com.votaciones.pachon.dto.UsuarioEntity;
import com.votaciones.pachon.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public void crearUsuario(UsuarioEntity objeto){

        repository.save(objeto);

    }

    public UsuarioEntity listarUsuario(String documentoUsuario){

        return repository.findById(documentoUsuario).get();

    }

    public Boolean existeUsuario(String documentoUsuario){
        return repository.existsById(documentoUsuario);
    }

}
