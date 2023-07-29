package com.eduardo.sistemafacturaelectronica.models.entities;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Cliente implements Serializable {

    private Integer id;
    private String nombre;
    private String apellido;
    private String correo;
    private String tel;
    private String direccion;

    public Cliente(String nombre, String apellido, String correo, String tel, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.tel = tel;
        this.direccion = direccion;
    }
}
