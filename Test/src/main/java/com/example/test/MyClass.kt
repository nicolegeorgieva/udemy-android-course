package com.example.test

fun main() {
    print(add(5, 7))
}

val add: (Int, Int) -> Int = { a, b -> a + b }