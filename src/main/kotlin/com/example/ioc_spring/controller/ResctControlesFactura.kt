package com.example.ioc_spring.controller

import com.example.ioc_spring.modelo.Factura
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ResctControlesFactura {

    @Autowired
    lateinit var factura: Factura

    @GetMapping("", "/")
    fun facturaIndex(): Factura {
        return factura
    }
}