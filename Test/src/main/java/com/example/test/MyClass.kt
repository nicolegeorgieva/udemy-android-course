package com.example.test

fun main() {
    val listOfItems = listOf("Nicole", "Iliyan", "Amy", "Sarah")
    val listOfNumbers = listOf(23, 45, 64)

    val finder = Finder(list = listOfNumbers)
    finder.findItem(element = 34) {
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