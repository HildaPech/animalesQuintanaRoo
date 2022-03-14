package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class Aves : AppCompatActivity() {
    var grid:GridView?=null
    var adaptador:AdaptadorCustomGrid?=null
    companion object{
        var animalesD = ArrayList<Animal>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aves)
        animalesD= ArrayList()

        animalesD?.add(Animal("Tucán Pico Canoa", R.drawable.aveuno, R.drawable.manzana,"Ramphastos sulfuratus", "descripción", "Habitat", "comida"))
        animalesD?.add(Animal("Chachalaca Oriental", R.drawable.avedos, R.drawable.manzana,"Ortalis vetula", "descripción", "Habitat", "comida"))
        animalesD?.add(Animal("Flamenco Americano", R.drawable.avetres, R.drawable.manzana, "Phoenicopterus ruber", "descripción", "Habitat", "comida"))
        animalesD?.add(Animal("Garza Morena", R.drawable.avecuatro, R.drawable.manzana, "Ardea herodias", "descripción", "Habitat", "comida"))
        animalesD?.add(Animal("Águila Pescadora", R.drawable.avecinco, R.drawable.manzana, "Pandion haliaetus", "descripción", "Habitat", "comida"))
        animalesD?.add(Animal("Carpintero Cheje", R.drawable.aveseis, R.drawable.manzana, "Melanerpes aurifrons", "descripción", "Habitat", "comida"))


        grid=findViewById<GridView>(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        adaptador =  AdaptadorCustomGrid(this, animalesD!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleAve::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }
    }
}