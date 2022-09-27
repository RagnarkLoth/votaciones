package com.votaciones.pachon.services;

import com.votaciones.pachon.dto.CandidatosEntity;
import com.votaciones.pachon.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CandidatoService {

    @Autowired
    private CandidatoRepository repository;

    public void crearCandidato(CandidatosEntity objeto){

        repository.save(objeto);

    }

    public List<CandidatosEntity> listaCandidatos(){

        List<CandidatosEntity> candidatosV = new ArrayList<>();

        repository.findAll().forEach(candidatoF -> {
            candidatoF.setCantidadVotos(cantidadVotos(candidatoF.getNumeroVoto()));
            candidatosV.add(candidatoF);
        });

        return candidatosV;

    }

    private int cantidadVotos(Long idCandidato) {

        return repository.findById(idCandidato).get().getCantidadVotos();

    }

    public void guardarVoto(Long idCandidato){
        CandidatosEntity candidatos = repository.findById(idCandidato).get();
        candidatos.setCantidadVotos(candidatos.getCantidadVotos() + 1);
        repository.save(candidatos);
    }
}
