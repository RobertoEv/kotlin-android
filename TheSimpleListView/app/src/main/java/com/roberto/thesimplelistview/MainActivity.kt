package com.roberto.thesimplelistview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ListViews = adaptar and datasource
        var namesArray: Array<String> = arrayOf("Roberto", "Dimitri", "David", "Renato",
                "Nichollas", "Vitor", "Davi", "Manu", "Lucas", "Paulo", "Camila", "Vinicius",
                "Renan", "Mario", "Henrique", "Mateus", "Pedro")

        var namesAdapter: ArrayAdapter<String> = ArrayAdapter(this,
                android.R.layout.simple_list_item_1, namesArray)

        listView.adapter = namesAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            var itemName: String = listView.getItemAtPosition(position).toString()
            Toast.makeText(this, "Id $id - Nome: $itemName",
                    Toast.LENGTH_SHORT).show()
        }
    }
}
