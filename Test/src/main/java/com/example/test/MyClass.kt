package com.example.test

fun main() {
    multipleOf2()
}

fun multipleOf2() {
    for (i in 1..100) {
        if (i % 2 == 0) {
            println("$i is multiple of 2")
        }
    }
}
