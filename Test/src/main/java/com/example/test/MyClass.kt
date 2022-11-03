package com.example.test

fun main() {
    multipleOf(message = "is multiple of", multipleOf = 11)
}

fun multipleOf(first: Int = 1, second: Int = 1000, message: String, multipleOf: Int) {
    for (i in first..second) {
        if (i % multipleOf == 0) {
            println("$i $message $multipleOf")
        }
    }
}
