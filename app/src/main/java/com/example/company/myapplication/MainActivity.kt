package com.example.company.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonPrev = findViewById<Button>(R.id.button_prev1)
        val buttonNext = findViewById<Button>(R.id.button_next1)
        buttonPrev.setOnClickListener {
            val intentPrev = Intent(this,ThirdActivity::class.java)
            startActivity(intentPrev)
        }
        buttonNext.setOnClickListener {
            val intentNext = Intent(this,SecondActivity::class.java)
            startActivity(intentNext)
        }

    }
}
