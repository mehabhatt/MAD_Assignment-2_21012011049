package com.example.mad_assignment_2_21012011049

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val signup: Button = findViewById(R.id.signup_button)
        signup.setOnClickListener {
            Intent(this@Login, Registration::class.java).also { startActivity(it) }
        }
    }
}