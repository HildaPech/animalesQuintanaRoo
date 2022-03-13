package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class Manzana : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manzana)
        var animalesM = ArrayList<Animal>()

        animalesM.add(Animal("Manzana", R.drawable.manzana))
        animalesM.add(Animal("Durazno", R.drawable.durazno))
        animalesM.add(Animal("Plátano", R.drawable.platano))
        animalesM.add(Animal("Sandía", R.drawable.sandia))


        val grid: GridView = findViewById(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        val adaptador =  AdaptadorCustomGrid(this, animalesM)
        grid.adapter = adaptador
        grid.onItemClickListener = AdapterView.OnItemClickListener{ parent, view, position, id ->
            Toast.makeText(this, animalesM.get(position).nombre, Toast.LENGTH_LONG).show()}
    }
    }
