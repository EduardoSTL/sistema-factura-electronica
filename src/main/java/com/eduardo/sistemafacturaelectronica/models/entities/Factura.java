package com.eduardo.sistemafacturaelectronica.models.entities;

import com.eduardo.sistemafacturaelectronica.repository.FacturaRepository;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
public class Factura extends Empresa implements FacturaRepository {

    private Integer noFactura;
    private Date fecha = new Date();
    private Cliente cliente;
    private Product[] products;
    public final static int MAX_PRODUCTS = 5;

    Integer cantidadProductos = 0;

    //cada factura toma un valor:
    public Factura() {
        noFactura++;
        products = new Product[5];
    }

    public Factura(String nombreEmpresa, String nit) {
        super(nombreEmpresa, nit);
    }

    public Factura( Date fecha, Cliente cliente) {
        this();
        this.fecha = fecha;
        this.cliente = cliente;
    }


    @Override
    public void addProduct(Product product) {
        try {
            if (cantidadProductos< MAX_PRODUCTS ){
                products[cantidadProductos++]= product;
            } else {
                ++cantidadProductos;
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println(" ================== ");
        }
    }

    @Override
    public void imprimirFactura() {
        System.out.println("====== FACTURA DIGITAL ======");
        super.toString();
        this.toString();
        System.out.println("Datos Cliente: " + this.cliente);
        double total=0;
        for (int i = 0; i < this.cantidadProductos; i++){
            System.out.println(products[i].getNombre()+products[i]+products[i].getPrecio());
            total+=products[i].getPrecio();
        }
        System.out.println("Total: " + "$" + total);
    }
}
