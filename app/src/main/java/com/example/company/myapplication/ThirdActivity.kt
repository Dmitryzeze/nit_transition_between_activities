package com.example.company.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val buttonPrev = findViewById<Button>(R.id.button_prev3)
        val buttonNext = findViewById<Button>(R.id.button_next3)
        buttonPrev.setOnClickListener {
            val intentPrev = Intent(this,SecondActivity::class.java)
            startActivity(intentPrev)
        }
        buttonNext.setOnClickListener {
            val intentNext = Intent(this,MainActivity::class.java)
            startActivity(intentNext)
        }
    }
}
