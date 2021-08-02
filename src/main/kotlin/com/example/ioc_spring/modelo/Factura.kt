package com.example.ioc_spring.modelo

import org.springframework.beans.factory.annotation.Autowired
import lombok.Getter
import lombok.Setter
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.context.annotation.RequestScope

@Component
@RequestScope
@Getter
@Setter
class Factura {
    //@RequestScope mantiene la intancia hata que se destruye con la peticion HTTP

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