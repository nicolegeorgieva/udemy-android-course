package com.example.test

fun main() {
//    val myListOfNames = listOf("Nicole", "Iliyan", "Amy")
    val myMutableList = mutableListOf(5, 4, 3, 7)

    myMutableList.add(6)

    myMutableList.removeAt(1)

    print(myMutableList)
}



