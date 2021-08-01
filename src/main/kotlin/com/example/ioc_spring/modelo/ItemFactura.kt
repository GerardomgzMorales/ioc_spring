package com.example.ioc_spring.modelo

import lombok.Getter
import lombok.Setter
import kotlin.math.roundToInt

@Getter
@Setter
class ItemFactura(producto: Producto?, cantidad: Int?) {

    var producto: Producto? = null
    var cantidad: Int? = null
    var totalPagado = 0.0

    init {
        this.producto = producto
        this.cantidad = cantidad
        totalPagado = calculoProducto()
    }

    private fun calculoProducto(): Double {
        var estado = 0.0
        val monto = this.producto?.precioProducto?.times(this.cantidad!!)
        if (monto != null) {
            estado = (monto * 100.0).roundToInt() / 100.0
        }
        return estado
    }
}