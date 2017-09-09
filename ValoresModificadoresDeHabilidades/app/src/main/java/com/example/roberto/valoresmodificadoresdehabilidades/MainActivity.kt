package com.example.roberto.valoresmodificadoresdehabilidades

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var modifier: Int?

        checkBtn.setOnClickListener {
            modifier = checkModifier(valueTxt.text.toString().toInt())
            resultTxt.text = modifier.toString()
        }
    }

    fun checkModifier(value: Int): Int {

        var modifier = (value - 10) / 2

        if (value < 10 && value % 2 == 1) modifier -= 1

        return modifier
    }
}
