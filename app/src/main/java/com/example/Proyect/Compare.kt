package com.example.Proyect

class Compare {
    fun compare(text1: String, text2: String): String
    {
        val result: String
        var boolean = true

        if (text1==text2)
        {
            boolean = false
        }

        result = if (boolean)
        {
            "The texts are different"
        }
        else
        {
            "The texts are the same"
        }

        return result
    }
}