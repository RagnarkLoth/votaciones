package com.votaciones.pachon.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "candidato")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CandidatosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_voto")
    private Long numeroVoto;

    @Column(name = "nombre_candidato")
    private String nombreCandidato;

    @Column(name = "edad_candidato")
    private String edadCandidato;

    @Column(name = "partido_candidato")
    private String partidoCandidato;

    @Column(name = "descripcion_candidato")
    private String descripcionCandidato;

    @Column(name = "ruta_imagen")
    private String rutaImagen;

    private int cantidadVotos;

}
