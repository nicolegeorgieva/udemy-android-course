package com.example.test

fun main() {
    val person = Person(name = "Amy", lastName = "Grace", age = 20)
    val person2 = Person(name = "Nicole", lastName = "Georgieva", age = 23)
    val person3 = Person(name = "Iliyan", lastName = "Germanov", age = 25)

    val listOfPeople = listOf(person, person2, person3)
    listOfPeople.forEach { someone ->
        println(someone.age)
    }
}

data class Person(val name: String, val lastName: String, val age: Int)