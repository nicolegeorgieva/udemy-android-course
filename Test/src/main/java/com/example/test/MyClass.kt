package com.example.test

fun main() {
    name("Iliyan")
}

val name: (String) -> Unit = { name -> print(name) }
