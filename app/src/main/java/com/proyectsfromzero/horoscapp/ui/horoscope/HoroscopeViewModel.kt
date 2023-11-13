package com.proyectsfromzero.horoscapp.ui.horoscope

import androidx.lifecycle.ViewModel
import com.proyectsfromzero.horoscapp.data.provider.HoroscopeProvider
import com.proyectsfromzero.horoscapp.domain.model.HoroscopeInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import com.proyectsfromzero.horoscapp.domain.model.HoroscopeInfo.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@HiltViewModel
class HoroscopeViewModel @Inject constructor(horoscopeProvider: HoroscopeProvider) : ViewModel() {

    private var _horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope:StateFlow<List<HoroscopeInfo>> = _horoscope

    init {
        _horoscope.value = horoscopeProvider.getHoroscopes()
    }
}