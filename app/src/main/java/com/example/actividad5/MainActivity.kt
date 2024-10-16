package com.example.actividad5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonAjustes = findViewById<Button>(R.id.button)

        botonAjustes.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent);
        }

    }
}