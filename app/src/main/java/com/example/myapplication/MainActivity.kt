@file:Suppress("SpellCheckingInspection")

package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
import java.text.NumberFormat


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setTitle("Tip calculater")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            calculateTip()
        }
    }
    private fun calculateTip()
    {
        var costAmount = binding.costOfServiceEditText.text.toString()
        var amount = costAmount.toDoubleOrNull()
        if (amount==null)
        {
            binding.tipResult.text=" "
            return
        }
        var radioPercentage = binding.radioGroup.checkedRadioButtonId
        val tipPercentage = when(radioPercentage)
        {
            R.id.rb1->0.20
            R.id.rb2->0.15
            else->0.10
        }
        amount *= tipPercentage
        var switch = binding.swch.isChecked
        if(switch)
        {
            amount = kotlin.math.ceil(amount)
        }
        var formatednumber = NumberFormat.getCurrencyInstance().format(amount)
        binding.tipResult.text = getString(R.string.tip,formatednumber)
    }
}