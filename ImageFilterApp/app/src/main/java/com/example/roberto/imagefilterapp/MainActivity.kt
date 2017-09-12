package com.example.roberto.imagefilterapp

import android.graphics.Color
import android.graphics.PorterDuff
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)













        d20ImageView.setOnClickListener {
            d20ImageView.setColorFilter(colorsArray[getRandom(colorsArray.size)],
                    PorterDuff.Mode.OVERLAY)

//            println(getRandom(4)) Logcat
        }
    }

    fun getRandom(arraySize: Int): Int{

        var rand = Random()
        var randomNum = rand.nextInt(arraySize)

        return randomNum
    }

}
