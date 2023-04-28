package com.example.memesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PageActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)
        var nextMeme = findViewById<TextView>(R.id.tvnextpg4)
        nextMeme.setOnClickListener{
            var intent = Intent(this,PAgeActivity5::class.java)
            startActivity(intent)
        }
        var prevMeme = findViewById<TextView>(R.id.tvprev4)
        prevMeme.setOnClickListener{
            var intent = Intent(this,PageActivity3::class.java)
            startActivity(intent)
        }
    }
}