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
        listaItem.add(ItemFactura(Producto("MacBook Pro M1", 23584.22), 77))
        listaItem.add(ItemFactura(Producto("Xbox one S", 6543.22), 17))
        listaItem.add(ItemFactura(Producto("Play 5", 12547.22), 99))
        listaItem.add(ItemFactura(Producto("iPad Air", 74547.22), 177))
        return listaItem
    }
}