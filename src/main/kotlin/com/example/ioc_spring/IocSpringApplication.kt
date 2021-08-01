package com.example.ioc_spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IocSpringApplication

fun main(args: Array<String>) {
    runApplication<IocSpringApplication>(*args)
}
