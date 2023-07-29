package com.eduardo.sistemafacturaelectronica.models.entities;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empresa implements Serializable {
    private String nombreEmpresa;
    private String nit;
}
