package com.example.test

fun main() {
    val person = Person(name = "Amy", lastName = "Grace", age = 20)
    println(person)
}

data class Person(val name: String, val lastName: String, val age: Int)