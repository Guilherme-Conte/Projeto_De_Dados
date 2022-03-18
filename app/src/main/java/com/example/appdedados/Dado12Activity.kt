package com.example.appdedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Dado12Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dado12)

        val buttonD12 = findViewById<Button>(R.id.buttonGirarD12)
        val buttonLimp = findViewById<Button>(R.id.buttonLimparD12)
        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)

        buttonD12.setOnClickListener {
            mostrarLados12()
        }
        buttonLimp.setOnClickListener {
            limparNumb()
        }
        buttonVoltar.setOnClickListener {
            finish()
        }

    }
    private fun mostrarLados12() {
        val numb = (1..12).random()
        val textResult = findViewById<TextView>(R.id.textViewD12)

        textResult.text = numb.toString()
    }
    private fun limparNumb(){
        val limpar = findViewById<TextView>(R.id.textViewD12)

        limpar.text = null
    }
}

