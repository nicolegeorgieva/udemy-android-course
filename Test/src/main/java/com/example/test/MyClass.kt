package com.example.test

fun main() {
    multipleOf(1, 100, "Action")
}

fun multipleOf(first: Int, second: Int, genre: String) {
    for (i in first..second) {
        if (i % 2 == 0 && genre == "Action") {
            println("Number $i is an action movie multiple of 2.")
        } else if (genre !== "Action"){
            println(genre)
        }
    }
}
