package com.nestdev.neuroprotocol.domain.useCases

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ CalculateResultModule::class ])
interface UseCaseFactory {
    fun createUseCase(): UseCase

    companion object {
        fun create() = DaggerUseCaseFactory.create()
    }
}