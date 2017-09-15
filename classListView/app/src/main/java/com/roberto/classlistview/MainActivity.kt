package com.roberto.classlistview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var classesArray = arrayOf<String>("Dragonborn", "Dwarf", "Elf", "Gnome",
                "Half-elf", "Half-orc", "Halfling", "Human", "Tiefling")

        var classesAdapter: ArrayAdapter<String> = ArrayAdapter(this,
                android.R.layout.simple_list_item_1, classesArray)

        classListView.adapter = classesAdapter

        classListView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Id: $id", Toast.LENGTH_SHORT).show()
        }
    }
}
