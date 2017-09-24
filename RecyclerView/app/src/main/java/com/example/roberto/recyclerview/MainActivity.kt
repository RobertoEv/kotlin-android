package com.example.roberto.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.roberto.recyclerview.controller.PersonListAdapter
import com.example.roberto.recyclerview.model.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var adapter: PersonListAdapter? = null
    private var personList: ArrayList<Person>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        personList = ArrayList<Person>()
        layoutManager = LinearLayoutManager(this)
        adapter = PersonListAdapter(personList!!, this)

        // Setup List ( RecyclerView )
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

        // Load Data
        for (i in 0..16) {
            val person = Person()
            person.name = "Roberto" + i
            person.age = 20 + i
            personList!!.add(person)
        }

        adapter!!.notifyDataSetChanged()

    }
}
