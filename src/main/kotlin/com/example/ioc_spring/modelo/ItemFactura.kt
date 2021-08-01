package com.example.ioc_spring.modelo

import lombok.Getter
import lombok.Setter
import kotlin.math.roundToInt

@Getter
@Setter
class ItemFactura {
    var producto: Producto? = null
    var cantidad = 0
    var totalPagado = 0.0

    constructor() {}
    constructor(producto: Producto?, cantidad: Int) {
        this.producto = producto
        this.cantidad = cantidad
        totalPagado = calculoProducto()
    }

    private fun calculoProducto(): Double {
        val monto = producto!!.precioProducto * cantidad
        return (monto * 100.0).roundToInt() / 100.0
    }
}