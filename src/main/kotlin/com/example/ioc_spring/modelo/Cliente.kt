package com.example.ioc_spring.modelo

import lombok.Getter
import lombok.Setter
import lombok.ToString
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.context.annotation.RequestScope

@Component
@RequestScope
@Setter
@Getter
@ToString
class Cliente {
    @Value("\${cliente.nombre}")
    var nombre: String? = null

    @Value("\${cliente.apellido}")
    var apellidos: String? = null

    constructor() {}
    constructor(nombre: String?, apellidos: String?) {
        this.nombre = nombre
        this.apellidos = apellidos
    }
}