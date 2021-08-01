package com.example.ioc_spring.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemFactura {

    private Producto producto;
    private int cantidad;

    public ItemFactura() {
    }

    public ItemFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
}
