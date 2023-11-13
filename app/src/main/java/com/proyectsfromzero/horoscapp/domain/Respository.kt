package com.proyectsfromzero.horoscapp.domain

import com.proyectsfromzero.horoscapp.domain.model.PredictionModel

interface Respository {
    suspend fun getPrediction(sign: String): PredictionModel?
}