package com.hfy.bottom.ui.home.build

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BuildViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home build Fragment"
    }
    val text: LiveData<String> = _text
}