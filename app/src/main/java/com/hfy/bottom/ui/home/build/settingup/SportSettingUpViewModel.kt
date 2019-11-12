package com.hfy.bottom.ui.home.build.settingup

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hfy.bottom.domain.Sports


class SportSettingUpViewModel (private val sport:Sports): ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = sport.type
    }
    val text: LiveData<String> = _text
}