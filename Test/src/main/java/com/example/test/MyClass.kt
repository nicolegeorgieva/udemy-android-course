package com.example.test

fun main() {
    val myListOfNames = listOf("Nicole", "Iliyan", "Amy")

    val found = myListOfNames.filter {
        it == "Amy"
    }

    print(found)
}



