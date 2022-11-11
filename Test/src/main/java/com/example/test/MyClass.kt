package com.example.test

fun main() {
    val listOfNumbers = listOf(23, 45, 64)

    val person = Person(name = "Nicole")
    val person2 = Person(name = "Iliyan")
    val person3 = Person(name = "Sarah")

    val listOfPeople = listOf(person, person2, person3)


    val finder = Finder(list = listOfPeople)
    finder.findItem(element = person) {
        println("Found $it")
    }
}

class Finder<T>(private val list: List<T>) {
    fun findItem(element: T, foundItem: (element: T?) -> Unit) {
        val itemFound = list.filter {
            it == element
        }

        if (itemFound.isEmpty()) foundItem(null) else
            foundItem(itemFound.first())
    }
}

data class Person(val name: String)