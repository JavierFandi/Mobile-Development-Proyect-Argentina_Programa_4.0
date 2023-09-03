package com.example.Proyect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.widget.addTextChangedListener
import com.example.Proyect.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()
    private var text1: String = " "
    private var text2: String = " "
    private lateinit var compare: Compare
    private lateinit var result: String

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        compare = Compare()


        mainViewModel.result.observe(this)
        {
            binding.Text1.addTextChangedListener{text1 = binding.Text1.text.toString()}
            binding.Text2.addTextChangedListener{text2 = binding.Text2.text.toString()}

            result = compare.compare(text1, text2)

        }

        binding.compareButton.setOnClickListener()
        {
            mainViewModel.result(result)
            binding.Result.text = result
        }
    }
}