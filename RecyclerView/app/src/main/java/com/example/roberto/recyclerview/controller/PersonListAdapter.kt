package com.example.roberto.recyclerview.controller

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.example.roberto.recyclerview.R
import com.example.roberto.recyclerview.model.Person

class PersonListAdapter(private val list: ArrayList<Person>,
                        private val context: Context): RecyclerView.Adapter<PersonListAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        // Create our view from our xml file
        val view = LayoutInflater.from(context).inflate(R.layout.list_row, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bindItem(list[position])
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindItem(person: Person) {
            var name: TextView = itemView.findViewById(R.id.name)
            var age: TextView = itemView.findViewById(R.id.age)

            name.text = person.name
            age.text = person.age.toString()

            itemView.setOnClickListener {
                Toast.makeText(context, name.text, Toast.LENGTH_SHORT).show()
            }
        }
    }

}