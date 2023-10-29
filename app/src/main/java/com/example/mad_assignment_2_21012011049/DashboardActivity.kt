package com.example.mad_assignment_2_21012011049

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import com.google.android.material.button.MaterialButton

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val doctorListView = findViewById<ListView>(R.id.doctorListView)
        doctorListView.adapter=PersonAdapter(this,
            arrayListOf(
            Doctor("Dr. John Doe", "Cardiology Doctor"),
            Doctor("Dr. Jane Smith", "Dentist"),
            Doctor("Dr. Michael Johnson", "Orthopedic Surgeon"),
            Doctor("Dr. Emily Brown", "Ophthalmologist"),
            Doctor("Dr. David Lee", "Pediatrician"),
            Doctor("Dr. Sarah Wilson", "Dermatologist")
        )

        )
        val heartcard= findViewById<ImageView>(R.id.heart).setOnClickListener(){

        }
    }

    }
