package com.example.test

fun main() {
    multipleOf(1, 1000, 13)
}

fun multipleOf(first: Int, second: Int, third: Int) {
    for (i in first..second) {
        if (i % third == 0) {
            println("$i is multiple of $third")
        }
    }
}
