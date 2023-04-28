package com.example.memesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PageActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)
        var nextMeme = findViewById<TextView>(R.id.tvnext)
        nextMeme.setOnClickListener{
            var intent = Intent(this,PageActivity2::class.java)
            startActivity(intent)
        }

        var home = findViewById<TextView>(R.id.tvHome)
        home.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}