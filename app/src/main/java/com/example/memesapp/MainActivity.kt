package com.example.memesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var viewMemes = findViewById<TextView>(R.id.tvviewmeme)
        viewMemes.setOnClickListener {
            var intent = Intent(this,PageActivity1::class.java)
            startActivity(intent)
        }
    }
}