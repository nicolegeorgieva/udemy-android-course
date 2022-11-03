package com.example.test

fun main() {
    multipleOf2(1, 1000)
}

fun multipleOf2(first: Int, second: Int) {
    for (i in first..second) {
        if (i % 2 == 0) {
            println("$i is multiple of 2")
        }
    }
}
