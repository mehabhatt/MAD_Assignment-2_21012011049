package com.example.mad_assignment_2_21012011049

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        val login: Button = findViewById(R.id.login_btn)
        login.setOnClickListener {
            Intent(this@Registration, Login::class.java).also { startActivity(it) }
        }
    }
}