package com.example.ioc_spring.configuracion

import com.example.ioc_spring.modelo.ItemFactura
import com.example.ioc_spring.modelo.Producto
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource


@Configuration
@PropertySource("classpath:string/string.properties", encoding = "UTF-8")
class FacturaConfig {

    @Bean
    fun listaFactura(): MutableList<ItemFactura>? {
        val listaItem = mutableListOf<ItemFactura>()
        listaItem.add(ItemFactura(Producto("MacBook Pro M1", 25785.88), 10))
        listaItem.add(ItemFactura(Producto("Xbox one S", 9599.0), 17))
        listaItem.add(ItemFactura(Producto("Play 5", 13999.99), 99))
        listaItem.add(ItemFactura(Producto("iPad Air", 10499.0), 100))
        return listaItem
    }
}