package com.votaciones.pachon.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsuarioEntity {

    @Id
    @Column(name = "numero_identificacion")
    private String numeroIdentificacion;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @Column(name = "edad_usuario")
    private String edadUsaurio;

    @Column(name = "rol")
    private String rol;

}
