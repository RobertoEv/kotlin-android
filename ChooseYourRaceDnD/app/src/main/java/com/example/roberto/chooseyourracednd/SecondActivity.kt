package com.example.roberto.chooseyourracednd

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data = intent.extras

        if (data != null) {
            var race = data.get("race").toString()
            var abilityScore = data.get("abilityScore").toString()
            var speed = data.get("speed").toString()
            var skill = data.get("skill").toString()
            var languages = data.get("languages").toString()

            classTextViewId.text = race
            resultTextViewId.text = "Ability Score: $abilityScore" +
                    "\n\nSpeed: $speed \n\nSkills: $skill \n\nLanguages: $languages"
        }
    }
}
