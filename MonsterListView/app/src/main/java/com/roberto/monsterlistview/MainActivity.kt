package com.roberto.monsterlistview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var monsterArray = arrayOf<String>("Aarakocra", "Aboleth", "Abominable Yeti", "Acolyte",
                "Adult Black Dragon", "Adult Blue Dracolich", "Adult Blue Dragon",
                "Adult Brass Dragon", "Adult Bronze Dragon", "Adult Copper Dragon",
                "Adult Gold Dragon", "Adult Green Dragon", "Adult Red Dragon", "Adult Silver Dragon",
                "Adult White Dragon", "Air Elemental", "Allosaurus", "Ancient Black Dragon")

        // ArrayAdapter(context, Resource, Array)
        var monsterAdapter: ArrayAdapter<String> = ArrayAdapter(this,
                android.R.layout.simple_list_item_1, monsterArray)

        monsterListView.adapter = monsterAdapter

        // setOnItemClickListener { parent, view, position, id -> }
        monsterListView.setOnItemClickListener { parent, view, position, id ->
            var monsterName: String = monsterListView.getItemAtPosition(position).toString()
            Toast.makeText(this, "Id: $id - Monster: $monsterName", Toast.LENGTH_SHORT).show()
        }

    }
}
