package com.example.roberto.animalbios

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(p0: View?) {
        when(p0!!.id) {
            cheetahId.id -> {

                var cheetahIntent = Intent(this, DetailsActivity::class.java)
                cheetahIntent.putExtra("animal", "cheetah")
                startActivity(cheetahIntent)
            }
            lionId.id -> {
                var lionIntent = Intent(this, DetailsActivity::class.java)
                lionIntent.putExtra("animal", "lion")
                startActivity(lionIntent)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cheetah = cheetahId
        var lion = lionId

        // Register our views to receive onClickListener Events
        cheetah.setOnClickListener(this)
        lion.setOnClickListener(this)
    }
}
