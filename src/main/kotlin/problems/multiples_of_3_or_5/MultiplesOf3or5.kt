package org.example.problems.multiples_of_3_or_5

class MultiplesOf3or5 {
    fun solution(number: Int) : Int {
        if(number < 0) {
            return 0
        }

        var res = 0

        for(i in 0 until number) {
            if(i % 3 == 0 || i % 5 == 0) {
                res += i

                println("num: $i - res : $res")
            }
        }

        return res
    }
}