package com.example.actividad5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val botonVolver = findViewById<Button>(R.id.button2)

        botonVolver.setOnClickListener {
            finish()
        }
    }
}