package com.eduardo.sistemafacturaelectronica.models.entities;

import lombok.*;

import java.io.Serializable;

@Data
public class Direccion implements Serializable {

    private String dpto;
    private String calle;
    private String numero;
    private String codigoPostal;

}
