package com.example.test

fun main() {
    print(applyDiscount(10.0, 10, true))
}

val applyDiscount: (Double, Int, Boolean) -> Double = { price, discount, valid ->
    if (valid) {
        price * (1 - discount / 100.0)
    } else {
        price
    }
}
