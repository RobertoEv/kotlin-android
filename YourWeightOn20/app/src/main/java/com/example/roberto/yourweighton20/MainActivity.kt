package com.example.roberto.yourweighton20

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    val marsGravity = 0.38
    val venusGravity = 0.91
    val jupiterGravity = 2.34

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        marsCheckBox.setOnClickListener(this) //Registering our clicklistener
        venusCheckBox.setOnClickListener(this)
        jupiterCheckBox.setOnClickListener(this)

        showWeightButton.setOnClickListener {

            //  var result = calculateWeight(weight.toString().toDouble())
            //  resultTextView.text = "You weight " + result.toString() + " on mars."

        }

    }

    override fun onClick(v: View?) {
        v as CheckBox
        var isChecked: Boolean = v.isChecked
        var weight = enterWeight.text

        when(v.id){
            R.id.marsCheckBox -> if(isChecked && !TextUtils.isEmpty(enterWeight.text.toString()))
                                    {
                                        calculateWeight(weight.toString().toDouble(), v)
                                        venusCheckBox.isChecked = false
                                        jupiterCheckBox.isChecked = false
                                    }
            R.id.venusCheckBox -> if(isChecked && !TextUtils.isEmpty(enterWeight.text.toString()))
                                    {
                                        (calculateWeight(weight.toString().toDouble(), v))
                                        marsCheckBox.isChecked = false
                                        jupiterCheckBox.isChecked = false
                                    }
            R.id.jupiterCheckBox -> if(isChecked && !TextUtils.isEmpty(enterWeight.text.toString()))
                                    {
                                        calculateWeight(weight.toString().toDouble(), v)
                                        marsCheckBox.isChecked = false
                                        jupiterCheckBox.isChecked = false
                                    }
        }

    }

    fun calculateWeight(userWeight: Double, checkBox: CheckBox) {

        var result: Double?
        var gravity: Double?
        var planet: String?

        when(checkBox.id) {
            R.id.marsCheckBox -> {
                gravity = marsGravity
                planet = "Mars"
            }
            R.id.venusCheckBox -> {
                gravity = venusGravity
                planet = "Venus"
            }
            R.id.jupiterCheckBox -> {
                gravity = jupiterGravity
                planet = "Jupiter"
            }
            else -> {
                gravity = marsGravity
                planet = "Mars"
            }
        }

        result = userWeight * gravity
        resultTextView.text = "Weight is " + result.format(2) + " on " + planet

    }
    //Function to print only 2 digits
    fun Double.format(digits: Int) = java.lang.String.format("%.${digits}f", this)
}
