package com.hfy.bottom.ui.home.index.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class SportDetailViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is sport detail Fragment"
    }
    val text: LiveData<String> = _text
}