package com.example.roberto.shownextactivity

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
            var char = data.getChar("char").toString()
            var age: String = data.getInt("age").toString()

            Toast.makeText(this, "Name: $name\nChar: $char\nAge: $age",
                    Toast.LENGTH_LONG).show()
        }

        goBackButton.setOnClickListener {
            var returnIntent = this.intent
            returnIntent.putExtra("return", "Hello from Second Activity")
            setResult(Activity.RESULT_OK, returnIntent)
            finish()
        }

    }
}
