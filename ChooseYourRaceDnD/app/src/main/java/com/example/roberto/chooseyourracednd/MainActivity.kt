package com.example.roberto.chooseyourracednd

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextId.text = "Teste: Roberto Evangelista \nTeste: Roberto Evangelista \n"

    }

    override fun onClick(p0: View?) {
        p0 as CheckBox // Casting
        var isChecked: Boolean = p0.isChecked

        when(p0.id){
            R.id.dwarfCheckBox -> if (isChecked){
                onlyOneChecked("dwarf", p0)
            }

        }
    }

    fun onlyOneChecked(race: String, checkBox: CheckBox) {
        if (race != "dwarf") R.id.dwarfCheckBox.isChecked = false
        else if (race != "elf") elfCheckBox.isChecked = false
        else if (race != "halfling") halflingCheckBox.isChecked = false
        else if (race != "human") humanCheckBox.isChecked = false
        else if (race != "dragonborn") dragonbornCheckBox.isChecked = false
        else if (race != "gnome") gnomeCheckBox.isChecked = false
        else if (race != "halfElf") halfElfCheckBox.isChecked = false
        else if (race != "halfOrc") halfOrcCheckBox.isChecked = false
        else tiefllingCheckBox.isChecked = false
    }
}
