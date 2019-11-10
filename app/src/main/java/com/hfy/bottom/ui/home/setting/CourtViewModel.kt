package com.hfy.bottom.ui.home.setting

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CourtViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home court Fragment"
    }
    val text: LiveData<String> = _text
}