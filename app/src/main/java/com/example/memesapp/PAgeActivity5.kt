package com.example.memesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PAgeActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)
        var nextMeme = findViewById<TextView>(R.id.tvprev5)
        nextMeme.setOnClickListener{
            var intent = Intent(this,PageActivity4::class.java)
            startActivity(intent)
        }
    }
}