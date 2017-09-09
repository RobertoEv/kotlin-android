package com.example.roberto.characteradvancement

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var exp: Int?
        var level: Int?
        var proficiency: Int?

        checkButton.setOnClickListener {
            exp = expEditText.text.toString().toInt()
            level = expToLevel(exp!!)
            if (level == 0){
                levelText.text = "Enter valid exp"
                proficiencyText.text  = "Enter valid exp"
            } else {
                proficiency = proficiencyBonus(level!!)
                levelText.text = "Level: " + level.toString()
                proficiencyText.text = "Proficiency: " + proficiency.toString()
            }
        }
    }

    fun expToLevel(exp: Int): Int {
        var level: Int
        when(exp){
            in 0..299 -> level = 1
            in 300..899 -> level = 2
            in 900..2699 -> level = 3
            in 2700..6499 -> level = 4
            in 6500.. 13999 -> level = 5
            in 14000..22999 -> level = 6
            in 23000..33999 -> level = 7
            in 34000..47999 -> level = 8
            in 48000..63999 -> level = 9
            in 64000..84999 -> level = 10
            in 85000..99999 -> level = 11
            in 100000..199999 -> level = 12
            in 120000..139999 -> level = 13
            in 140000..164999 -> level = 14
            in 165000..194999 -> level = 15
            in 195000..224999 -> level = 16
            in 225000..264999 -> level = 17
            in 265000..304999 -> level = 18
            in 305000..354999 -> level = 19
            else -> if (exp > 0) level = 20 else level = 0
        }
        return level
    }

    fun proficiencyBonus(level: Int): Int {
        var proficiency: Int
        when(level){
            in 1..4 -> proficiency = 2
            in 5..8 -> proficiency = 3
            in 9..12 -> proficiency = 4
            in 13..16 -> proficiency = 5
            else -> proficiency = 6
        }
        return proficiency
    }
}
