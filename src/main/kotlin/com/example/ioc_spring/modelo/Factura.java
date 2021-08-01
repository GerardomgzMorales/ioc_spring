package com.example.ioc_spring.modelo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
@Setter
@ToString
public class Factura {
    @Value("${factura.desc}")
    private String descripcionFactura;
    @Autowired
    private Cliente cliente;
    @Autowired
    private List<ItemFactura> listaItemFactura;

    public Factura() {

    }

    public Factura(String descripcionFactura, Cliente cliente, List<ItemFactura> listaItemFactura) {
        this.descripcionFactura = descripcionFactura;
        this.cliente = cliente;
        this.listaItemFactura = listaItemFactura;
    }
}
