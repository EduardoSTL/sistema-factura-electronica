package com.eduardo.sistemafacturaelectronica.testFactura;

import com.eduardo.sistemafacturaelectronica.models.entities.Cliente;
import com.eduardo.sistemafacturaelectronica.models.entities.Factura;
import com.eduardo.sistemafacturaelectronica.models.entities.Product;

import java.util.Date;

public class InnitFactura {
    public static void main(String[] args) {
        System.out.println("====== TEST FACTURA ======");
        Cliente cliente1 = new Cliente("Juan", "Perez", "juan@gmail.com", "2323", "San Salvador");
        Product p1 =new Product(1,"Jabon", 2.0,"Soap");
        Product p2 =new Product(2,"Linterna", 3.0,"Light");
        Product p3 =new Product(3, "Cereal", 2.0,"kornflakes");

        Factura factura = new Factura("Super", "131-44");
        factura = new Factura(new Date(),cliente1);
        factura.addProduct(p1);
        factura.addProduct(p2);
        factura.addProduct(p3);

        factura.imprimirFactura();
    }
}
