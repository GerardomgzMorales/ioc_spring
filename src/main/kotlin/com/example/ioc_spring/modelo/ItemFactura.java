package com.example.ioc_spring.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemFactura {

    private Producto producto;
    private int cantidad;
    private double totalPagado;

    public ItemFactura() {
    }

    public ItemFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.totalPagado = calculoProducto();
    }

    private double calculoProducto() {
        double monto = this.producto.getPrecioProducto() * this.cantidad;
        return Math.round(monto * 100.0) / 100.0;
    }
}
