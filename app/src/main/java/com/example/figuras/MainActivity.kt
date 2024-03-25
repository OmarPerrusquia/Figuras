package com.example.figuras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1: Button =findViewById(R.id.btn1)//Trapecio
        val btn2:Button=findViewById(R.id.btn2)//cuadrado
        val btn3:Button=findViewById(R.id.btn3)//circulo
        val btn4:Button=findViewById(R.id.btn4)//triangulo

        btn1.setOnClickListener {
            var trapecio:Intent=Intent(this,Trapecio::class.java)
            startActivity(trapecio)
        }

        btn2.setOnClickListener {
            var cuadrado:Intent=Intent(this,Cuadrado::class.java)
            startActivity(cuadrado)
        }

        btn3.setOnClickListener {
            var circulo:Intent=Intent(this,Circulo::class.java)
            startActivity(circulo)

        }

        btn4.setOnClickListener {
            var triangulo:Intent=Intent(this,Triangulo::class.java)
            startActivity(triangulo)


    }
}
}