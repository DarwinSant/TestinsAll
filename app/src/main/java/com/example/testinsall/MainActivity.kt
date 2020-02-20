package com.example.testinsall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        aplicar.setOnClickListener {

            val modeloEscrito = modeloText.text.toString()
            val colorEscrito = colorText.text.toString()

            var nissan = AutoDeportivos("blabalabla","$modeloEscrito","$colorEscrito")
            Texto.setText("${nissan.modelos} y ${nissan.desig } ${nissan.color}")
        }


    }
}
