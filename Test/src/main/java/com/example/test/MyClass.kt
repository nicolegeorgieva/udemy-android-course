package com.example.test

fun main() {
    say(23) { age -> age >= 18 }
    say(9) { age -> age >= 21 }
}

fun say(age: Int, isAdult: (Int) -> Boolean) {
    val result = isAdult(age)

    if(result) {
        println("You're adult.")
    } else {
        println("You're young.")
    }
}

