package com.example.test

fun main() {
    println("Hello, ".append("Miss"))
}

fun String.append(toAppend: String): String {
    return this.plus(toAppend)
}