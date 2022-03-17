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

        animalesM?.add(Animal("Mono Araña", R.drawable.mamiferouno, R.drawable.mono,"Ateles geoffroyi", "El mono araña pertenece al grupo de primates con mayor tamaño corporal, miden entre 35 y 45 cm de estatura y su cola puede alcanzar los 85 cm; su peso oscila entre los 7.5 y 8.2 kg. Es de constitución delgada con extremidades largas en comparación al tamaño de su cuerpo, su cabeza es relativamente pequeña, los machos carecen de barba, poseen una cola cuya parte interior esta desnuda que utilizan como quinto miembro para desplazarse ágilmente entre los árboles. En la espalda presenta una coloración oscura, en la región abdominal posee un color más claro, además de presentar un mechón en la parte superior de la cabeza y una coloración clara en la zona que rodea los ojos.", "Habitat", "comida"))
        animalesM?.add(Animal("Jaguar", R.drawable.mamiferodos, R.drawable.jaguar, "Panthera onca", "El jaguar es el único felino grande de América y el tercero más grande del mundo, después de los tigres y los leones. Son muy parecidos a los leopardos, que viven en África y Asia, pero las manchas de los jaguares son más complejas y suelen tener un punto en el centro. A diferencia de muchos otros felinos, los jaguares no rechazan el agua. Cazan peces, tortugas e incluso caimanes, usando unas fauces increíblemente poderosas para perforar los cráneos de sus presas.", "Habitat", "comida"))
        animalesM?.add(Animal("Manatí del Caribe", R.drawable.mamiferotres, R.drawable.manti, "Trichechus manatus", "Es un animal corpulento que tiene un aspecto pisciforme con una aleta terminal redondeada en forma de espátula. Su piel esta finamente arrugada, con cinco centímetros de espesor, cubierto generalmente por algas y pequeños moluscos. La cabeza se ensancha y se une sin cuello ni hombros. No tiene ningún miembro posterior, los manatíes poseen miembros delanteros flexibles y a manera de remo, o aletas.", "Habitat", "comida"))
        animalesM?.add(Animal("Tamandua mexicana", R.drawable.mamiferocuatro, R.drawable.tamandua, "Tamandua mexicana", "Es un oso hormiguero de tamaño mediano con una cola prensil, pequeños ojos y orejas y un hocico largo. Su cuerpo mide entre 50 y 80 cm de longitud, y su cola prensil entre 40 y 65 cm. Pesa entre 3,5 y 8,5 kg. El pelaje es de color amarillo pálido en la mayor parte del cuerpo, con un parche distintivo de pelaje negruzco en los costados, la espalda y los hombros, cuya forma se parece bastante a un chaleco. La cola solo tiene pelaje en la parte superior sobre aproximadamente un tercio de su longitud. Las patas traseras tienen cinco dedos con garras fuertes, mientras que las patas delanteras tienen cuatro.", "Habitat", "comida"))
        animalesM?.add(Animal("Tapir", R.drawable.mamiferocinco, R.drawable.tapir, "Tapirus bairdii", "Los tapires son un género de mamíferos perisodáctilos de la familia Tapiridae. Es el único género actual de la familia, que incluye otros nueve géneros extintos. Pertenece al orden de los perisodáctilos, que incluye también a los caballos, con los que están lejanamente emparentados, y a los rinocerontes, que son sus parientes vivos más cercanos. Son animales de tamaño mediano, con una longitud que varía desde el 1,3 m hasta los 2,5 m, con una cola de 5 a 10 cm de largo, y una altura en la cruz de 70 cm a 1,2 m y un peso de 110 a 300 kg.", "Habitat", "comida"))
        animalesM?.add(Animal("Coatí", R.drawable.mamiferoseis, R.drawable.coati, "Nasua narica", "El coatí de nariz blanca, también conocido como pizote, antón o tejón mexicano, es un mamífero carnívoro de la familia de los prociónidos que habita en Centroamérica y el sector meridional de Norteamérica. Son omnívoros, prefiriendo pequeños vertebrados, y se alimentan también con frutos, carroña, insectos y huevos. Pueden subir los árboles con facilidad, utilizando la cola para equilibrarse, pero es más frecuente que busquen alimento en el suelo. Sus depredadores incluyen boas, aves rapaces, félidos, y tayras.", "Habitat", "comida"))


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