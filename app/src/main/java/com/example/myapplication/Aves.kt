package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class Aves : AppCompatActivity() {
    var grid:GridView?=null
    var adaptador:AdaptadorCustomGrid?=null
    companion object{
        var animalesD = ArrayList<Animal>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aves)
        animalesD= ArrayList()

        animalesD?.add(Animal("Tucán Pico Canoa", R.drawable.aveuno, R.drawable.tucan,"Ramphastos sulfuratus", "De las tres especies de tucanes que se distribuyen en México, esta es la más grande con una longitud de entre 50 y 59 cm y un peso aproximado de 500 g. Plumaje negro que contrasta con el amarillo del cuello y pecho, parte superior de la cabeza marrón, piel alrededor del ojo verde, iris y tarsos azules, pico largo y aserrado color verde claro con una combinación de tonos azul y amarillo, destacando la punta anaranjado-rojizo; cobertoras superiores de la cola blancas e inferiores rojas. El macho tiene el pico más largo que la hembra.", "Habitat", "comida"))
        animalesD?.add(Animal("Chachalaca Oriental", R.drawable.avedos, R.drawable.chachalaca,"Ortalis vetula", "Mide de 50 a 56 cm de longitud y pesa entre 430 y 800 g. La cabeza y el cuello son grises oscuros o negruzcos. El plumaje del dorso y las alas es castaño oliváceo. La larga cola es de color negruzco verdoso, con la punta blanca. Tiene plumas de tonos rufos o rojizos en la base de la cola, en la rabadilla, en la parte superior de las patas, y en la punta de las alas. Presenta pico negruzco y garganta roja.", "Habitat", "comida"))
        animalesD?.add(Animal("Flamenco Americano", R.drawable.avetres, R.drawable.flamenco, "Phoenicopterus ruber", "El flamenco del Caribe alcanza de 1,20 a 1,40 m de altura. Es un ave esbelta: el macho pesa en promedio 2,8 kg y la hembra 2,2 kg. Es el flamenco más grande del continente, y el segundo del mundo, superado por el flamenco común (Phoenicopterus roseus). Su color puede variar desde el rosa pálido hasta un carmesí o bermellón, dependiendo de la zona donde viva y de la cantidad de crustáceos con altos contenidos carotenoides que consuma.", "Habitat", "comida"))
        animalesD?.add(Animal("Garza Morena", R.drawable.avecuatro, R.drawable.garza, "Ardea herodias", "Grande y delgada con la espalda gris azulada, cuello blanco y gorra negra. Ampliamente distribuida y conspicua (aunque no abundante) en marismas, ríos y lagos desde Panamá hasta el sur de Chile y Argentina, usualmente a elevaciones bajas. Se puede ver solo o en congregaciones con otras garzas. Donde el rango traslapa con Great Blue Heron, busca el cuello blanco y una gorra negra más extensa.", "Habitat", "comida"))
        animalesD?.add(Animal("Águila Pescadora", R.drawable.avecinco, R.drawable.aguila, "Pandion haliaetus", "El águila pescadora mide entre 52 y 60 cm de alto, con una envergadura que oscila entre 152 y 167 cm. De partes superiores castaño oscuro, e inferiores blancas, jaspeadas de oscuro, con una máscara oscura a los lados de la cabeza. De cola larga y estrecha, y alas angulosas, es fácil de identificar. Posee unas plumas alargadas en la nuca que forman una cresta que se eriza con frecuencia. Los ejemplares juveniles se identifican por las manchas marrón claro de su plumaje y, en general, por un tono más pálido. Los machos adultos se distinguen de las hembras por el cuerpo más delgado y las alas más estrechas. Son fáciles de distinguir al ver una pareja, pero no tanto con individuos solitarios.", "Habitat", "comida"))
        animalesD?.add(Animal("Carpintero Cheje", R.drawable.aveseis, R.drawable.carpintero, "Melanerpes aurifrons", "Barrado blanco y negro en la espalda, pecho y cara beige pálido. Observa la nuca amarillo anaranjado. Los machos adultos tienen coronas rojas. En vuelo, busca la rabadilla blanca. Se encuentra en bosques abiertos y matorrales áridos con arbustos desde Texas hasta Nicaragua. Visita los comederos, especialmente por naranjas y jaleas. Anida en cavidades.", "Habitat", "comida"))


        grid=findViewById<GridView>(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        adaptador =  AdaptadorCustomGrid(this, animalesD!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleAve::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }
    }
}