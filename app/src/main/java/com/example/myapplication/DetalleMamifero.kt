package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetalleMamifero : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_mamifero)
        val index = intent.getStringExtra("ID")?.toInt()
        //Log.d("INDEX", index.toString())
        val contacto = index?.let { Mamiferos.animalesM?.get(it) }
        var imageView = findViewById<ImageView>(R.id.imageView)
        var tvNombre = findViewById<TextView>(R.id.tvNombre)
        var tvNombreC = findViewById<TextView>(R.id.tvNombreC)
        var tvDescripcion = findViewById<TextView>(R.id.tvDescripcion)


        imageView.setImageResource(contacto!!.imagenD)
        tvNombre.text= contacto?.nombre
        tvNombreC.text= contacto?.nombreC
        tvDescripcion.text= contacto?.descripcion

    }
}