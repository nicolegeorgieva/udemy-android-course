package com.example.test

fun main() {
    val myListOfNames = listOf("Nicole", "Iliyan", "Amy")

    val found = myListOfNames.filter {
        it.startsWith("i", ignoreCase = true)
    }

    print(found)
}



