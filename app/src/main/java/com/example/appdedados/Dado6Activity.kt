package com.example.appdedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

        class Dado6Activity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dado6)

        val buttonD6 = findViewById<Button>(R.id.buttonGirar)
        val buttonLimp = findViewById<Button>(R.id.buttonLimparD6)
        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)


        buttonD6.setOnClickListener {
            mostrarLados()
        }
        buttonLimp.setOnClickListener {
            limparNumb()
        }
        buttonVoltar.setOnClickListener {
            finish()
        }

    }
    private fun mostrarLados() {
            val numb = (1..6).random()
            val textResult = findViewById<TextView>(R.id.textDoResult2)

            textResult.text = numb.toString()
    }
        fun limparNumb(){
            val limpar = findViewById<TextView>(R.id.textDoResult2)

            limpar.text = null
    }

}