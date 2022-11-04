package com.example.test

fun main() {
    val catAge = calculateCatAge(7)
    print("This cat is $catAge years old.")
}

fun calculateCatAge(age: Int): Int {
    return age * 7
}