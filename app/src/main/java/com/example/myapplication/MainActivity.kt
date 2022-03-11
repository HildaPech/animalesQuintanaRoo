package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtNombre = findViewById<EditText>(R.id.txtNombre)
        val txtPass = findViewById<EditText>(R.id.txtPass)

        val btnIngresar = findViewById<Button>(R.id.btnIngresar)

        btnIngresar.setOnClickListener{
            val nUsuario = txtNombre.getText().toString()
            val pass:String = txtPass.getText().toString()
            if (nUsuario.equals("Hilda") && pass.equals("yayix1001")){
                var intent = Intent(this, listaAnimales::class.java)
                startActivity(intent)
                Toast.makeText(this, "Conoce a los animales", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_SHORT).show()
            }
        }

    }

}