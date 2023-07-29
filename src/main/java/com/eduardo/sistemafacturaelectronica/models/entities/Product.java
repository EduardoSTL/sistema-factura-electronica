package com.eduardo.sistemafacturaelectronica.models.entities;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {

    private Integer id;
    private String nombre;
    private Double precio;
    private String fabricante;

}
