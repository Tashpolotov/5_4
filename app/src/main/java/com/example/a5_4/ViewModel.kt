package com.example.a5_4

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ViewModel @Inject constructor(): androidx.lifecycle.ViewModel() {

    private val _count = MutableLiveData<Double>()
    val count: LiveData<Double> = _count

    private var a = 0.0
    private val bminus = 0.0
    private val bplus = 10.0
    private val _snackBar = MutableLiveData<String>()
    val snacBar: LiveData<String> = _snackBar


    fun increas(){
        if (a == bplus) {
            _snackBar.value = "vy dostigli predela"
        } else{
            a++
            _count.value = a
        }
    }

    fun onCreas() {
        if (a == bminus) {
            _snackBar.value = "vy dostogli predela"
        } else {
            a --
            _count.value = a
        }
    }


 }