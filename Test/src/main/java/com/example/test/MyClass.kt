package com.example.test

fun main() {
    val catAge = calculateCatAge(7)

    if (checkAge(catAge)) {
        print("This cat is old.")
    }
}

fun calculateCatAge(age: Int): Int {
    return age * 7
}

fun checkAge(catAge: Int): Boolean {
    return catAge > 14
}