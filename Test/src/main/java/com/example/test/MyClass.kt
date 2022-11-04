package com.example.test

fun main() {
    print(calculateCatAge(7))
}

val calculateCatAge: (Int) -> Int = { age -> age * 7 }