package com.example.test

fun main() {
    val person = Person("Iliyan", 25)
    val person2 = Person("Nicole", 23)

    printPerson(person)
    printPerson(person2)
}

class Person(
    val name: String,
    val age: Int
)

fun printPerson(person: Person) {
    println("${person.name} is ${person.age} years old.")
}