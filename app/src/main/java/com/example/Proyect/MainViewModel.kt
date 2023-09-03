package com.example.Proyect

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel()
{
    val result: LiveData<Result> get() = _result
    private var _result = MutableLiveData(Result("A"))

    fun result(text1: String)
    {
        if(text1=="Los textos son iguales")
        {
            val text = "Los textos son iguales"
            updateResult(text)
        }
        else
        {
            val text = "Los textos son distintos"
            updateResult(text)
        }
    }

    private fun updateResult(text: String)
    {
        _result.value = Result(text)
    }
}