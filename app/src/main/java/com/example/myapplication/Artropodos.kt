package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class Artropodos : AppCompatActivity() {
    var grid: GridView?=null
    var adaptador:AdaptadorCustomGrid?=null
    companion object{
        var animalesA = ArrayList<Animal>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artropodos)
        animalesA= ArrayList()

        animalesA?.add(Animal("Langosta del Caribe", R.drawable.aruno, R.drawable.manzana,"Panulirus argus", "descripción", "Habitat", "comida"))
        animalesA?.add(Animal("Araña Tejedora Espinoza", R.drawable.ardos, R.drawable.manzana,"Gasteracantha cancriformis", "descripción", "Habitat", "comida"))
        animalesA?.add(Animal("Cangrejo Herradura", R.drawable.artres, R.drawable.manzana, "Limulus polyphemus", "descripción", "Habitat", "comida"))
        animalesA?.add(Animal("Cangrejo Azul", R.drawable.arcuatro, R.drawable.manzana, "Callinectes sapidus", "descripción", "Habitat", "comida"))
        animalesA?.add(Animal("Abeja Melipona", R.drawable.arcinco, R.drawable.manzana, "Melipona", "descripción", "Habitat", "comida"))
        animalesA?.add(Animal("Alacrán café esbelto", R.drawable.arseis, R.drawable.manzana, "Centruroides gracilis", "descripción", "Habitat", "comida"))


        grid=findViewById<GridView>(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        adaptador =  AdaptadorCustomGrid(this, animalesA!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleArtropodo::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }
    }
}