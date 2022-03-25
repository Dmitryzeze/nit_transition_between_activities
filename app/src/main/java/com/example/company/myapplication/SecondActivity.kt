package com.example.company.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val buttonPrev = findViewById<Button>(R.id.button_prev2)
        val buttonNext = findViewById<Button>(R.id.button_next2)
        buttonPrev.setOnClickListener {
            val intentPrev = Intent(this,MainActivity::class.java)
            startActivity(intentPrev)
        }
        buttonNext.setOnClickListener {
            val intentNext = Intent(this,ThirdActivity::class.java)
            startActivity(intentNext)
        }
    }
}
