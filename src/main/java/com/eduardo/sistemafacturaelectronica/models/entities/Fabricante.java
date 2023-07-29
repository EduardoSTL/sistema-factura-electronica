package com.eduardo.sistemafacturaelectronica.models.entities;

import lombok.*;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fabricante implements Serializable {

    private Integer id;
    private String nombreFabricante;
    private String nacionalidad;
}
