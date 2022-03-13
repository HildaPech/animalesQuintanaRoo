package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class Durazno : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_durazno)
        var animalesD = ArrayList<Animal>()

        animalesD.add(Animal("Manzana", R.drawable.manzana))
        animalesD.add(Animal("Durazno", R.drawable.durazno))
        animalesD.add(Animal("Plátano", R.drawable.platano))
        animalesD.add(Animal("Sandía", R.drawable.sandia))


        val grid: GridView = findViewById(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        val adaptador =  AdaptadorCustomGrid(this, animalesD)
        grid.adapter = adaptador
        grid.onItemClickListener = AdapterView.OnItemClickListener{ parent, view, position, id ->
            Toast.makeText(this, animalesD.get(position).nombre, Toast.LENGTH_LONG).show()}
    }
}