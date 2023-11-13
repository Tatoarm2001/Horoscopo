package com.proyectsfromzero.horoscapp.data

import android.util.Log
import com.proyectsfromzero.horoscapp.data.network.HoroscopeApiService
import com.proyectsfromzero.horoscapp.domain.Respository
import com.proyectsfromzero.horoscapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) :
    Respository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("tato", "Error en : ${it.message}") }
        return null
    }
}