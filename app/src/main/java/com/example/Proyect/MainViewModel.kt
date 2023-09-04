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
        if(text1=="The texts are the same")
        {
            val text = "The texts are the same"
            updateResult(text)
        }
        else
        {
            val text = "The texts are different"
            updateResult(text)
        }
    }

    private fun updateResult(text: String)
    {
        _result.value = Result(text)
    }
}