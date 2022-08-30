package com.nestdev.neuroprotocol.domain.useCases

import com.nestdev.neuroprotocol.domain.MemoryCurveEnum
import com.nestdev.neuroprotocol.domain.Result
import javax.inject.Inject
import kotlin.math.abs

class CalculateResult @Inject constructor() : UseCase {

    private fun createResult(trialsArr: ArrayList<Int>) : Result {
        println("A result was created")
        return Result(trialsArr, trialsArr[0], calculateCurve(trialsArr))
    }

    /**
     * Calculating a curve of the memory
     */
    private fun calculateCurve(trialsArr: ArrayList<Int>): MemoryCurveEnum {
        var i = 0
        var increase = 0
        var decrease = 0

        while (i + 1 < trialsArr.size) {
            when {
                trialsArr[i] < trialsArr[i + 1] -> increase++
                trialsArr[i] > trialsArr[i + 1] -> decrease++
            }
           i++
        }
        return when {
            abs(increase - decrease) <= 2 -> MemoryCurveEnum.SAME
            increase > decrease -> MemoryCurveEnum.INCREASED
            decrease > increase -> MemoryCurveEnum.DECREASED
            else -> MemoryCurveEnum.SALTATORY
        }
    }

    override fun handle(trialsArr: ArrayList<Int>) {
       createResult(trialsArr)
    }
}
