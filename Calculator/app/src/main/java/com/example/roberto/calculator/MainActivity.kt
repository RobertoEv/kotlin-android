package com.example.roberto.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonNumberEvent(view: View){

        val buttonSelect = view as Button
        var buttonClickValue: String = visor.text.toString()
        when(buttonSelect.id){
            button0.id -> buttonClickValue += "0"
            button1.id -> buttonClickValue += "1"
            button2.id -> buttonClickValue += "2"
            button3.id -> buttonClickValue += "3"
            button4.id -> buttonClickValue += "4"
            button5.id -> buttonClickValue += "5"
            button6.id -> buttonClickValue += "6"
            button7.id -> buttonClickValue += "7"
            button8.id -> buttonClickValue += "8"
            button9.id -> buttonClickValue += "9"
            //TODO: Prevent adding more than 1 dot
            buttonDot.id -> buttonClickValue += "."
            buttonPlusMinus.id -> buttonClickValue = "-" + buttonClickValue
        }
        visor.setText(buttonClickValue)
    }
}
