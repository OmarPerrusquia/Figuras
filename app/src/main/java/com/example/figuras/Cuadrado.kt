package com.example.figuras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Cuadrado : AppCompatActivity() {

    lateinit var lado1:EditText
    lateinit var lado2:EditText
    lateinit var resultado1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuadrado)

        lado1=findViewById(R.id.lado1)
        lado2=findViewById(R.id.lado2)

        resultado1=findViewById(R.id.resultado1)

        val calcular:Button=findViewById(R.id.calcular)
        calcular.setOnClickListener {
            calcularAreaCuadrado()
        }

        val regresar:Button=findViewById(R.id.btn_regresar1)
        regresar.setOnClickListener {
            var vR:Intent=Intent(this,MainActivity::class.java)
            startActivity(vR)
        }



    }

    private fun calcularAreaCuadrado() {
        val Lado1=lado1.toString().toDoubleOrNull()
        val Lado2=lado2.toString().toDoubleOrNull()

        if(Lado1!=null && Lado2!=null){
            val area=(Lado1*Lado2)
            resultado1.text="El area del cuadrado es de: "+area
        }
    }
}