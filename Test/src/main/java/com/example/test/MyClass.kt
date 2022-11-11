package com.example.test

fun main() {
    val listOfItems = listOf("Nicole", "Iliyan", "Amy", "Sarah")
    val finder = Finder(list = listOfItems)
    finder.findItem(element = "Sarah") {
        println("Found $it")
    }
}

class Finder(private val list: List<String>) {
    fun findItem(element: String, foundItem: (element: String?) -> Unit) {
        val itemFound = list.filter {
            it == element
        }

        if (itemFound.isEmpty()) foundItem(null) else
            foundItem(itemFound.first())
    }
}