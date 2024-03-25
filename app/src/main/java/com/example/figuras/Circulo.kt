package com.example.figuras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Circulo : AppCompatActivity() {
    lateinit var radio:EditText
    lateinit var resultado2:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circulo)

        radio=findViewById(R.id.radio)
        resultado2=findViewById(R.id.resultado2)

        val calcular:Button=findViewById(R.id.calcular1)
        calcular.setOnClickListener {
            calcularAreaCirculo()
        }

        val regresar:Button=findViewById(R.id.regresarcirculo)
        regresar.setOnClickListener {
            var vR: Intent = Intent(this,MainActivity::class.java)
            startActivity(vR)
        }



    }

    private fun calcularAreaCirculo() {
        val Radio=radio.text.toString().toDoubleOrNull()

        if(Radio!=null){

            val area=3.1416*Radio*Radio
            resultado2.text="El area del Circulo es de: "+area

        }
    }
}