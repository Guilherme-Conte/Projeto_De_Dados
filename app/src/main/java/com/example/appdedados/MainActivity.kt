package com.example.appdedados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button6 = findViewById<Button>(R.id.buttonD6)
        val button12 = findViewById<Button>(R.id.buttonD12)
        val button20 = findViewById<Button>(R.id.buttonD20)


        val Dado6 = Intent(this, Dado6Activity::class.java)
        val Dado12 = Intent(this, Dado12Activity::class.java)
        val Dado20 = Intent(this, Dado20Activity::class.java)



        button6.setOnClickListener {
            startActivity(Dado6)
        }
        button12.setOnClickListener {
            startActivity(Dado12)
        }
        button20.setOnClickListener {
            startActivity(Dado20)
        }

    }

}