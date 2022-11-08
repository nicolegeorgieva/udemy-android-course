package com.example.test

fun main() {
    val solution = Solution()
    print(solution.numJewelsInStones(jewels = "z", stones = "ZZ"))
}

class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        var result = 0
        for (x in stones) {
            for (y in jewels) {
                if (x == y) {
                    result += 1
                }
            }
        }
        return result
    }
}