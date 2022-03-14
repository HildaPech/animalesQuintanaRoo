package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class Reptiles : AppCompatActivity() {var grid:GridView?=null
    var adaptador:AdaptadorCustomGrid?=null
    companion object{
        var animalesR = ArrayList<Animal>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reptiles)
        animalesR= ArrayList()

        animalesR?.add(Animal("Nauyaca", R.drawable.reptiltres, R.drawable.nauyaca, "Bothrops asper", "descripción", "Habitat", "comida"))
        animalesR?.add(Animal("Cantil", R.drawable.reptilseis, R.drawable.cantil,"Agkistrodon bilineatus", "descripción", "Habitat", "comida"))
        animalesR?.add(Animal("Iguana Rayada", R.drawable.reptilcinco, R.drawable.manzana,  "Ctenosaura similis", "descripción", "Habitat", "comida"))
        animalesR?.add(Animal("Tortuga Verde", R.drawable.reptildos, R.drawable.manzana, "Chelonia mydas", "descripción", "Habitat", "comida"))
        animalesR?.add(Animal("Cocodrilo de Río", R.drawable.reptiluno, R.drawable.manzana, "Crocodylus acutus", "descripción", "Habitat", "comida"))
        animalesR?.add(Animal("Toloque Rayado", R.drawable.reptilcuatro, R.drawable.manzana, "Basiliscus vittatus", "descripción", "Habitat", "comida"))


        grid=findViewById<GridView>(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        adaptador =  AdaptadorCustomGrid(this, animalesR!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleReptil::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }
    }
    }
