package com.example.test

fun main() {
    val amount = 999

    when (amount) {
        in 1..100 -> print("This amount is between 1 and 100.")
        !in 10..90 -> print("This amount is outside the range.")
        999 -> print("Really close.")
        1000 -> print("Rich but not there.")
        1100 -> print("You've made it.")
        else -> print("$amount is just not going to work.")
    }
}
