package com.example.ioc_spring.modelo

import org.springframework.beans.factory.annotation.Autowired
import lombok.Getter
import lombok.Setter
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.context.annotation.SessionScope
import java.io.Serializable


@Component
@SessionScope
@Getter
@Setter
class Factura : Serializable {
    //@RequestScope mantiene la intancia hata que se destruye con la peticion HTTP

    @Value("\${factura.desc}")
    var descripcionFactura: String? = null

    @Autowired
    var cliente: Cliente? = null

    @Autowired
    var listaItemFactura: List<ItemFactura>? = null

    constructor() {}
    constructor(descripcionFactura: String?, cliente: Cliente?, listaItemFactura: List<ItemFactura>?) {
        this.descripcionFactura = descripcionFactura
        this.cliente = cliente
        this.listaItemFactura = listaItemFactura
    }
}