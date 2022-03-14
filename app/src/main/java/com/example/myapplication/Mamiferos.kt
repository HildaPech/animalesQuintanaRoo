package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class Mamiferos : AppCompatActivity() {
    var grid:GridView?=null
    var adaptador:AdaptadorCustomGrid?=null
    companion object{
        var animalesM = ArrayList<Animal>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mamiferos)
        animalesM= ArrayList()

        animalesM?.add(Animal("Mono Araña", R.drawable.mamiferouno, R.drawable.manzana,"Ateles geoffroyi", "descripción", "Habitat", "comida"))
        animalesM?.add(Animal("Jaguar", R.drawable.mamiferodos, R.drawable.manzana, "Panthera onca", "descripción", "Habitat", "comida"))
        animalesM?.add(Animal("Manatí del Caribe", R.drawable.mamiferotres, R.drawable.manzana, "Trichechus manatus", "descripción", "Habitat", "comida"))
        animalesM?.add(Animal("Tamandua mexicana", R.drawable.mamiferocuatro, R.drawable.manzana, "Tamandua mexicana", "descripción", "Habitat", "comida"))
        animalesM?.add(Animal("Tapir", R.drawable.mamiferocinco, R.drawable.manzana, "Tapirus bairdii", "descripción", "Habitat", "comida"))
        animalesM?.add(Animal("Coatí", R.drawable.mamiferoseis, R.drawable.manzana, "Nasua narica", "descripción", "Habitat", "comida"))


        grid=findViewById<GridView>(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        adaptador =  AdaptadorCustomGrid(this, animalesM!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleMamifero::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }
    }
}