package com.hfy.bottom.ui.home.build

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hfy.bottom.domain.Sports

class BuildViewModel : ViewModel() {
    private  val _sportsLiveData =MutableLiveData<List<Sports>>()
    val sportsLiveData : LiveData<List<Sports>>
        get()=_sportsLiveData

    init {
        _sportsLiveData.value = Sports.values().asList()
    }
}