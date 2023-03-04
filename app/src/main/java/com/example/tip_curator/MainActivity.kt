package com.example.tip_curator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tip_curator.databinding.ActivityMainBinding
import java.text.NumberFormat


class MainActivity : AppCompatActivity() {

//    Top level variable to be used across different methods in this class
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculateButton.setOnClickListener{
            calculateTip()
        }
    }

    private fun calculateTip() {
        val stringInTextField = binding.costOfServiceEditText.text.toString()
        val cost = stringInTextField.toDoubleOrNull()

        if (cost == null){
            binding.tipResult.text = getString(R.string.null_exception)
        }else{

            val tipPercentage = when(binding.tipOptions.checkedRadioButtonId){
                R.id.option_twenty_percent -> 0.20
                R.id.option_eighteen_percent -> 0.18
                else -> 0.15
            }

            var tip = tipPercentage * cost

            if (binding.roundUpSwitch.isChecked){
                tip = kotlin.math.ceil(tip)
            }

            val formattedTip = NumberFormat.getCurrencyInstance().format(tip)

            binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
        }






    }
}