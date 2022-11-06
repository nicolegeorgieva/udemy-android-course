package com.example.test

fun main() {
    val myListOfNames = listOf("Nicole", "Iliyan", "Amy")

    val found = myListOfNames.filter {
        it.startsWith("a", ignoreCase = true) && it.endsWith("y")
    }

    print(found)
}



