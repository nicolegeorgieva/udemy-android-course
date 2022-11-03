package com.example.test

fun main() {
    sayHello()
}

fun sayHello() {
    for (i in 1..100) {
        if (i % 2 == 0) {
            println("$i is multiple of 2")
        }
    }
}
