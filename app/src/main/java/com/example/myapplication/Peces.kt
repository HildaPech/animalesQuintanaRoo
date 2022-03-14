package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class Peces : AppCompatActivity() {
    var grid:GridView?=null
    var adaptador:AdaptadorCustomGrid?=null
    companion object{
        var animalesP = ArrayList<Animal>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peces)
        animalesP= ArrayList()

        animalesP?.add(Animal("Barracuda Gigante", R.drawable.pezuno, R.drawable.manzana,"Sphyraena barracuda", "descripción", "Habitat", "comida"))
        animalesP?.add(Animal("Morena Verde", R.drawable.pezdos, R.drawable.manzana,"Gymnothorax funebris", "descripción", "Habitat", "comida"))
        animalesP?.add(Animal("Huachinango", R.drawable.peztres, R.drawable.manzana, "Sparisoma viride", "descripción", "Habitat", "comida"))
        animalesP?.add(Animal("Cirujano Azul", R.drawable.pezcuatro, R.drawable.manzana, "Acanthurus coeruleus", "descripción", "Habitat", "comida"))
        animalesP?.add(Animal("Pámpano Palometa", R.drawable.pezcinco, R.drawable.manzana, "Trachinotus Falcatus", "descripción", "Habitat", "comida"))
        animalesP?.add(Animal("Caballod de Mar de Hocico Largo", R.drawable.pezseis, R.drawable.manzana, "Hippocampus reidi", "descripción", "Habitat", "comida"))

        grid=findViewById<GridView>(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        adaptador =  AdaptadorCustomGrid(this, animalesP!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetallePez::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }
    }
}