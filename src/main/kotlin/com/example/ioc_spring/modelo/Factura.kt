package com.example.ioc_spring.modelo

import org.springframework.beans.factory.annotation.Autowired
import lombok.Getter
import lombok.Setter
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
@Getter
@Setter
class Factura {
    @Value("\${factura.desc}")
    final var descripcionFactura: String? = null

    @Autowired
    final var cliente: Cliente? = null

    @Autowired
    final var listaItemFactura: List<ItemFactura>? = null

    constructor() {}
    constructor(descripcionFactura: String?, cliente: Cliente?, listaItemFactura: List<ItemFactura>?) {
        this.descripcionFactura = descripcionFactura
        this.cliente = cliente
        this.listaItemFactura = listaItemFactura
    }
}