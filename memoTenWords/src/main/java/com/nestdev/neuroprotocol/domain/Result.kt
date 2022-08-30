package com.nestdev.neuroprotocol.domain

/**
 * A class for storing results of the concrete participant
 */
data class Result(
    val trialsMap: HashMap<Int, Int>,
    val finalResult: Int,
    val memoryVolume: Int,
    val memoryCurveEnum: MemoryCurveEnum
)

