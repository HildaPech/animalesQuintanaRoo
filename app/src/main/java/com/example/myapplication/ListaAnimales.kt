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
        var animales:ArrayList<Lista> = ArrayList()
        animales.add(Lista("Reptiles", R.drawable.reptil))
        animales.add(Lista("Aves", R.drawable.ave))
        animales.add(Lista("Mamíferos", R.drawable.mamifero))
        animales.add(Lista("Peces", R.drawable.pez))
        animales.add(Lista("Artrópodos", R.drawable.artropodo))
        animales.add(Lista("Anfibios", R.drawable.anfibio))


        val listaAnimal = findViewById<ListView>(R.id.listaAnimal)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        val adaptador =  AdaptadorCustom(this, animales)

        listaAnimal.adapter = adaptador
        listaAnimal.onItemClickListener = AdapterView.OnItemClickListener{ parent, view, position, id ->
            if(position==0){
                startActivity(Intent(this, Reptiles::class.java))
            }else if(position==1){
                startActivity(Intent(this, Aves::class.java))
            }else if(position==2){
                startActivity(Intent(this, Mamiferos::class.java))
            }else if(position==3){
                startActivity(Intent(this, Peces::class.java))
            }else if(position==4){
                startActivity(Intent(this, Artropodos::class.java))
            }else{
                startActivity(Intent(this, Anfibios::class.java))
            }


    }

    }
    }