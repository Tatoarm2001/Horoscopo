package com.proyectsfromzero.horoscapp.domain.usecase

import com.proyectsfromzero.horoscapp.domain.Respository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Respository) {

    suspend operator fun invoke(sign: String) = repository.getPrediction(sign)

}