package com.example.memesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PageActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        var nextMeme = findViewById<TextView>(R.id.tvnext3)
        nextMeme.setOnClickListener {
            var intent = Intent(this, PageActivity4::class.java)
            startActivity(intent)
        }
            var prevMeme = findViewById<TextView>(R.id.tvprev3)
            prevMeme.setOnClickListener {
                var intent = Intent(this, PageActivity2::class.java)
                startActivity(intent)
            }

    }
}