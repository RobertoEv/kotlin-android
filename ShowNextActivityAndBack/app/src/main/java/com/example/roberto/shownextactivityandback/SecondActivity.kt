package com.example.roberto.shownextactivityandback

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data = intent.extras

        if (data != null){
            var name = data.get("name").toString()
            var age = data.getInt("age").toString()

            Toast.makeText(this, "Name: $name\nAge: $age", Toast.LENGTH_LONG).show()
        }

        secondButtonId.setOnClickListener {
            var returnIntent = this.intent

            returnIntent.putExtra("return", "Hello from Second Activity")
            setResult(Activity.RESULT_OK, returnIntent)
            finish()
        }

    }
}
