package com.example.a5_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.a5_4.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

        private lateinit var binding: ActivityMainBinding
        private val viewModel: ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
        initListeners()

    }

    private fun initView() {
        viewModel.count.observe(this){ count ->
            binding.tv.text = count.toString()

        }
        viewModel.count.observe(this) {snack ->
            binding.btnMinus.showSnackBar(snack.toString())
            binding.btnMinus.showSnackBar(snack.toString())
        }
    }

    private fun initListeners() {
        binding.btnMinus.setOnClickListener{
            viewModel.increas()
        }
        binding.btnPlus.setOnClickListener{
            viewModel.onCreas()
        }

    }
}