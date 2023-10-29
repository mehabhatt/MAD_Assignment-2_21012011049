package com.example.mad_assignment_2_21012011049

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var getStartedButton: Button
    lateinit var doctoranimation : AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val img = findViewById<ImageView>(R.id.imageView)
        img.setBackgroundResource(R.drawable.doctor_animation_list)
        doctoranimation = img.background as AnimationDrawable
        getStartedButton = findViewById(R.id.getstarted)
        getStartedButton.setOnClickListener {
            Intent(this@MainActivity, DashboardActivity::class.java).also { startActivity(it) }
        }
    }
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus){
            doctoranimation.start()
        }
        else{
            doctoranimation.stop()
        }
    }
}
