package com.nestdev.neuroprotocol.domain.useCases

import dagger.Binds
import dagger.Module

@Module
abstract class CalculateResultModule {
    @Binds
    abstract fun calculateResult(calculateResult: CalculateResult): UseCase
}