package com.example.figuras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Triangulo : AppCompatActivity() {

    lateinit var altura:EditText
    lateinit var base:EditText
    lateinit var resultado3:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangulo)

        altura=findViewById(R.id.altura1)
        base=findViewById(R.id.base)
        resultado3=findViewById(R.id.resultadotriangulo)

        val calcular:Button=findViewById(R.id.calcular3)
        calcular.setOnClickListener {
            calcularAreaTriangulo()

        }

        val regresar:Button=findViewById(R.id.regresar3)
        regresar.setOnClickListener {
            var vR: Intent = Intent(this,MainActivity::class.java)
            startActivity(vR)
        }

    }

    private fun calcularAreaTriangulo() {
        val Altura=altura.text.toString().toDoubleOrNull()
        val Base=base.text.toString().toDoubleOrNull()

        if(Altura!=null && Base!=null){

            val area=(Base*Altura)/2
            resultado3.text="El area del Triangulo es de: "+area

        }
    }
}