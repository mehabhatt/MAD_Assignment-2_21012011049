package com.example.mad_assignment_2_21012011049

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var getStartedButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedButton = findViewById(R.id.getstarted)

        getStartedButton.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
    }
}
