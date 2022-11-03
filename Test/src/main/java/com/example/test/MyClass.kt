package com.example.test

fun main() {
    val amount = 900

    when(amount) {
        100 -> print("You have 100.")
        125 -> print("You have 125.")
        999 -> print("Really close.")
        1000 -> print("Rich but not there.")
        1100 -> print("You've made it.")
        else -> {
            print("$amount is just not going to work.")
        }
    }
}
