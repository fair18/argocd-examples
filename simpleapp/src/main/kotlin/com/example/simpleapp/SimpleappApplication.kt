package com.example.simpleapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleappApplication

fun main(args: Array<String>) {
    runApplication<SimpleappApplication>(*args)
}
