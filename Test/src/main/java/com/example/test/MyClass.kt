package com.example.test

fun main() {
    println("Hello, ".append("Miss"))
    println("Nicole".removeFirstAndLastChars())
}

fun String.append(toAppend: String): String {
    return this.plus(toAppend)
}

fun String.removeFirstAndLastChars(): String {
    return this.substring(1, this.length - 1)
}