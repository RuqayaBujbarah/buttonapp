package com.example.buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var num = findViewById<TextView>(R.id.num)
        var plus = findViewById<Button>(R.id.Plus)
        var minus = findViewById<Button>(R.id.minus)
        var count = 0
        plus.setOnClickListener(){
            count++
            num.setText(count)
        }
        minus.setOnClickListener(){
            count--
            num.setText(count)
        }


    }
}