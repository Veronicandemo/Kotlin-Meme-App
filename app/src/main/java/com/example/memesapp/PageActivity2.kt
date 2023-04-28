package com.example.memesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PageActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        var nextMeme = findViewById<TextView>(R.id.tvnext2)
        nextMeme.setOnClickListener{
            var intent = Intent(this,PageActivity3::class.java)
            startActivity(intent)
        }
        var prevMeme = findViewById<TextView>(R.id.tvprev2)
        prevMeme.setOnClickListener {
            var intent = Intent(this, PageActivity1::class.java)
            startActivity(intent)
        }

    }
}