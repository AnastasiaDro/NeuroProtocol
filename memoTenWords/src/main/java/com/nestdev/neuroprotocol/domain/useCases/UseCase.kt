package com.nestdev.neuroprotocol.domain.useCases

interface UseCase {
    fun handle(trialsArr: ArrayList<Int>)
}