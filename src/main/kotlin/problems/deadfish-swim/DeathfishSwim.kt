package org.example.problems.`deadfish-swim`

import kotlin.math.pow

class DeathfishSwim {
    fun main() {

    }

    fun parse(data: String): List<Int> {

        //

        val valuesMap = mapOf<Char, DeathfishAction>(
            'i' to DeathfishAction.INCREMENT,
            'd' to DeathfishAction.DECREMENT,
            's' to DeathfishAction.SQUARE,
        )

        //

        val result = mutableListOf<Int>()
        var currentResultItem = 0
        data.forEach { char ->
            if (char != 'o') {
                when (valuesMap[char]) {
                    DeathfishAction.INCREMENT -> {
                        currentResultItem++
                    }

                    DeathfishAction.DECREMENT -> {
                        currentResultItem--
                    }

                    DeathfishAction.SQUARE -> {
                        currentResultItem = currentResultItem.toDouble().pow(2).toInt()
                    }

                    null -> {}
                }
            } else {
                result.add(currentResultItem)
            }

        }

        return result
    }

    enum class DeathfishAction {
        INCREMENT,
        DECREMENT,
        SQUARE
    }
}