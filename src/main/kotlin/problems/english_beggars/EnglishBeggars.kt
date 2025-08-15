package org.example.problems.english_beggars

class EnglishBeggars {
    fun beggars(input: List<Int>, n: Int): List<Int> {
        val result = Array(n) {
            0
        }

        if (n == 1) return listOf(input.sum())

        result.forEachIndexed { resultIndex, _ ->
            input
                .filterIndexed { inputIndex, _ ->
                    false
                }
                .sum()
                .also { result[resultIndex] = it }

        }
        return result.toList()
    }
}