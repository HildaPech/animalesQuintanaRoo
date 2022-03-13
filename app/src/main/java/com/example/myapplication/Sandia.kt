package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class Sandia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sandia)
        var animalesS = ArrayList<Animal>()

        animalesS.add(Animal("Manzana", R.drawable.manzana))
        animalesS.add(Animal("Durazno", R.drawable.durazno))
        animalesS.add(Animal("Plátano", R.drawable.platano))
        animalesS.add(Animal("Sandía", R.drawable.sandia))


        val grid: GridView = findViewById(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        val adaptador =  AdaptadorCustomGrid(this, animalesS)
        grid.adapter = adaptador
        grid.onItemClickListener = AdapterView.OnItemClickListener{ parent, view, position, id ->
            Toast.makeText(this, animalesS.get(position).nombre, Toast.LENGTH_LONG).show()}
    }
}