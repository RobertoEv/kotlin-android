package com.example.roberto.checkboxwidget

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onCheckBoxClicked(view: View) {
        //R
        view as CheckBox // Cast our view as Checkbox Object or Type or View
        var isChecked: Boolean = view.isChecked

        when(view.id){
            R.id.checkVeggies -> {
                if (isChecked) Log.d("Veggies", "IsChecked")
                else Log.d("Veggies", "NoChecked")
            }
            R.id.checkMeat -> {
                if (isChecked) Log.d("Meat", "Is Checked")
                else Log.d("Meat", "NoChecked")
            }
            R.id.checkFruit -> {
                if (isChecked) Log.d("Fruit", "Is Checked")
                else Log.d("Fruit", "NoChecked")
            }
        }

//        Log.d("Checks", "Checkbox Clicked")
    }
}
