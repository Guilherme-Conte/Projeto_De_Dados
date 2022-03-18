package com.example.appdedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Dado20Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dado20)

        val buttonD12 = findViewById<Button>(R.id.buttonGirarD20)
        val buttonLimp = findViewById<Button>(R.id.buttonLimparD20)
        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)

        buttonD12.setOnClickListener {
            mostrarLadosD20()
        }
        buttonLimp.setOnClickListener {
            limparNumb()
        }
        buttonVoltar.setOnClickListener {
            finish()
        }

    }
    fun mostrarLadosD20() {
        val numb = (1..20).random()
        val textResult = findViewById<TextView>(R.id.textViewD20)

        textResult.text = numb.toString()
    }
    fun limparNumb(){
        val limpar = findViewById<TextView>(R.id.textViewD20)

        limpar.text = null
    }
}