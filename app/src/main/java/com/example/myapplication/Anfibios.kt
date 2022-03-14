package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class Anfibios : AppCompatActivity() {
    var grid:GridView?=null
    var adaptador:AdaptadorCustomGrid?=null
    companion object{
        var animalesE = ArrayList<Animal>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anfibios)
        animalesE= ArrayList()

        animalesE?.add(Animal("Sapo Costero", R.drawable.anuno, R.drawable.manzana,"Incilius valliceps", "descripción", "Habitat", "comida"))
        animalesE?.add(Animal("Rana de árbol de Ojos Rojos", R.drawable.andos, R.drawable.manzana,"Agalychnis callidryas", "descripción", "Habitat", "comida"))
        animalesE?.add(Animal("Salamanquesa", R.drawable.antres, R.drawable.manzana, "Bolitoglossa mexicana", "descripción", "Habitat", "comida"))
        animalesE?.add(Animal("Rana arbórea locuaz", R.drawable.ancuatro, R.drawable.manzana, "Tlalocohyla loquax", "descripción", "Habitat", "comida"))
        animalesE?.add(Animal("Rana Termitera", R.drawable.ancinco, R.drawable.manzana, "Hypopachus variolosus", "descripción", "Habitat", "comida"))
        animalesE?.add(Animal("Salamandra Lengua de Hongo", R.drawable.anseis, R.drawable.manzana, "Bolitoglossa yucatana", "descripción", "Habitat", "comida"))


        grid=findViewById<GridView>(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        adaptador =  AdaptadorCustomGrid(this, animalesE!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleAnfibio::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }
    }
}
