package com.nestdev.neuroprotocol.domain

import com.nestdev.neuroprotocol.domain.useCases.UseCaseFactory

/**
 * My simple test file
 */
fun main() {
    val useCaseFactory = UseCaseFactory.create()
    val useCase = useCaseFactory.createUseCase()
    val arrayList = arrayListOf<Int>(1, 2, 3, 4, 5)
    useCase.handle(arrayList)
}
