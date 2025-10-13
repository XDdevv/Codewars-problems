package org.example.problems.pair_of_gloves

class PairOfGloves {
    fun numberOfPairs(gloves: List<String>): Int {
        val gloves = gloves.toMutableList()
        var res = 0

        for(i in 0 until gloves.size) {
            println("from i: ${gloves[i]}")

            for(j in i until gloves.size) {
                if (gloves[i] == gloves[j]) {
                    gloves.removeAt(i)
                    gloves.removeAt(j)
                    res += 1
                }
                println("from j: ${gloves[i]} - ${gloves[j]}")
            }
        }

        return res
    }
}