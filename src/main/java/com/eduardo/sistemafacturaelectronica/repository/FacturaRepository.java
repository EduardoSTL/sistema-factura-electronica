package com.eduardo.sistemafacturaelectronica.repository;

import com.eduardo.sistemafacturaelectronica.models.entities.Product;

public interface FacturaRepository {

    void imprimirFactura();

    void addProduct(Product product);
}
