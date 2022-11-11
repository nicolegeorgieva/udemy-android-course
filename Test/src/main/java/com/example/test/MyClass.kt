package com.example.test

fun main() {
    val input = Result.ERROR
    getResult(result = input)

}

fun getResult(result: Result) {
    return when (result) {
        Result.SUCCESS -> println("Success!")
        Result.FAILURE -> println("Failure!")
        Result.ERROR -> println("Error!")
    }
}

enum class Result {
    SUCCESS, FAILURE, ERROR
}

