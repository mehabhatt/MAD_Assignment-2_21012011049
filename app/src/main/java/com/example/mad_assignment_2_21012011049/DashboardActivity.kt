package com.example.mad_assignment_2_21012011049

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val doctorListView = findViewById<ListView>(R.id.doctorListView)


        val doctorNames = listOf(
            "Dr. John Doe",
            "Dr. Jane Smith",
            "Dr. Michael Johnson",
            "Dr. Emily Brown",
            "Dr. David Lee",
            "Dr. Sarah Wilson"
        )


        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, doctorNames)


        doctorListView.adapter = adapter


        doctorListView.setOnItemClickListener { _, _, position, _ ->
            val selectedDoctor = doctorNames[position]
        }
    }
}