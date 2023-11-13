package com.proyectsfromzero.horoscapp.domain.model

import com.proyectsfromzero.horoscapp.data.providers.HoroscopeInfo
import com.proyectsfromzero.horoscapp.data.providers.HoroscopeInfo.*
import javax.inject.Inject


class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Pisces
        )
    }
}