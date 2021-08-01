package com.example.ioc_spring.modelo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Producto {
    private String nombreProducto;
    private double precioProducto;

    public Producto(String nombreProducto, double precioProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }
}
