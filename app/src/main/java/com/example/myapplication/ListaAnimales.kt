package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView

class ListaAnimales : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_animales)
        var animales:ArrayList<Animal> = ArrayList()
        animales.add(Animal("Manzana", R.drawable.manzana))
        animales.add(Animal("Durazno", R.drawable.durazno))
        animales.add(Animal("Plátano", R.drawable.platano))
        animales.add(Animal("Sandía", R.drawable.sandia))


        val listaAnimal = findViewById<ListView>(R.id.listaAnimal)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        val adaptador =  AdaptadorCustom(this, animales)

        listaAnimal.adapter = adaptador
        listaAnimal.onItemClickListener = AdapterView.OnItemClickListener{ parent, view, position, id ->
            if(position==0){
                startActivity(Intent(this, Manzana::class.java))
            }else if(position==1){
                startActivity(Intent(this, Durazno::class.java))
            }else if(position==2){
                startActivity(Intent(this, Platano::class.java))
            }else{
                startActivity(Intent(this, Sandia::class.java))
            }


    }

    }
    }