package com.example.figuras

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class Trapecio : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    lateinit var a:EditText
    lateinit var b:EditText
    lateinit var altura:EditText
    lateinit var resultado:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trapecio)
        a = findViewById(R.id.a)
        b = findViewById(R.id.b)
        altura = findViewById(R.id.altura)
        resultado = findViewById(R.id.resultado)

        val calcular:Button=findViewById(R.id.btn_calc)
        calcular.setOnClickListener {
            calcularAreaTrapecio()
        }


        val btn_regresar:Button=findViewById(R.id.btn_regresar)
        btn_regresar.setOnClickListener {
            var vR:Intent=Intent(this,MainActivity::class.java)
            startActivity(vR)
        }

    }

    private fun calcularAreaTrapecio() {
        val LadoA=a.text.toString().toDoubleOrNull()
        val LadoB=b.text.toString().toDoubleOrNull()
        val alturaTrapecio=altura.text.toString().toDoubleOrNull()

        if(LadoA!=null && LadoB!=null && alturaTrapecio!=null){
            val area=((LadoA+LadoB)/2)*alturaTrapecio
            resultado.text="El area del trapecio es de: "+area

        }else{

        }
    }
}