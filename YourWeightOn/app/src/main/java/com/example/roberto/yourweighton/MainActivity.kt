package com.example.roberto.yourweighton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val marsGravity: Double = 0.38

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var weight =  earthWeightTxt.text

        showWeightButton.setOnClickListener {

        var result = calculateWeight(weight.toString().toDouble())

        resultWeight.text = "You weight"+ result.toString() +"on mars"

        }

    }

    fun calculateWeight(userWeight: Double): Double {

        return userWeight * marsGravity

    }
}
