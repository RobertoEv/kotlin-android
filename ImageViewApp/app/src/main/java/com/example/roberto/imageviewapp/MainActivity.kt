package com.example.roberto.imageviewapp

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dndImage = dndImageView
        var d20Image = d20ImageView

        dndImage.setColorFilter(Color.BLUE)
        d20Image.setColorFilter(Color.DKGRAY)

        dndImage.setOnClickListener {
            dndImage.clearColorFilter()
        }

        d20Image.setOnClickListener {
            d20Image.clearColorFilter()
//            d20Image.setColorFilter(Color.GREEN, PorterDuff.Mode.DARKEN)
            d20Image.setBackgroundColor(Color.MAGENTA)
        }

    }
}
