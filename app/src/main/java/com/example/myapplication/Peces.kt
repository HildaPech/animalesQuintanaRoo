package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class Peces : AppCompatActivity() {
    var grid:GridView?=null
    var adaptador:AdaptadorCustomGrid?=null
    companion object{
        var animalesP = ArrayList<Animal>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peces)
        animalesP= ArrayList()

        animalesP?.add(Animal("Barracuda Gigante", R.drawable.pezuno, R.drawable.barracuda,"Sphyraena barracuda", "La barracuda o \"espeton\" (Sphyraena barracuda) es un pez de mar perteneciente a la familia de los esfirénidos en el orden de los perciformes. Su forma hidrodinámica de torpedo la convierte en uno de los predadores marinos más exitosos: una vez descubre algún pez o pulpo descuidado lo persigue hasta alcanzarlo, lo despedaza y se aleja; después de un rato, regresa y nada en círculos alrededor de los trozos de alimento, hasta que decide comérselos.", "Habitat", "comida"))
        animalesP?.add(Animal("Morena Verde", R.drawable.pezdos, R.drawable.morena,"Gymnothorax funebris", "El cuerpo de la morena es comprimido, muy alargado y musculoso. La gran boca tiene largos dientes puntiagudos y caninos de animal carnívoro. La parte posterior de las ventanas nasales carece de tubos y el hocico es usualmente muy puntiagudo. La morena no tiene aletas pectorales, pero las aletas dorsal y anal son muy desarrolladas, a pesar de estar casi ocultas por tejido. Su color varía: verde, café verdoso o café y ocasionalmente presenta pequeños puntos blancos. Crece hasta 1.2 m (4 pies) de largo.", "Habitat", "comida"))
        animalesP?.add(Animal("Pez loro", R.drawable.peztres, R.drawable.pezloro, "Sparisoma viride", "Es uno del los 15 miembros pertenecientes al genero Sparisoma, que junto con 9 géneros adicionales conforman la familia de los peces loro (Scaridae) en la que hay descritas en la actualidad un total de 99 especies. Esta especie de pez loro habita las aguas del océano Atlántico occidental, desde el sur de Florida, Bermuda, Bahamas, incluyendo todo el Mar Caribe hasta llegar a las aguas de Brasil. Tiene preferencia por las aguas someras asociadas a los arrecifes coralinos, donde son muy activos durante el día, para durante la noche buscar cobijo entre los corales. Su rostro es redondeado, y cuenta con una robusta y potente boca terminal, en la que los dientes se han fusionado entre si para formar su fuerte pico.", "Habitat", "comida"))
        animalesP?.add(Animal("Cirujano Azul", R.drawable.pezcuatro, R.drawable.cirujano, "Acanthurus coeruleus", "El pez cirujano azul, barbero azul o Acanthurus coeruleus, puede confundirse con el pez cirujano real (Paracanthurus Hepatus), porque en las zonas de origen al pez Cirujano real se le denomina Blue tang o Caribbean Blue tang, lo que genera cierta confusión. Aunque los dos peces son Acantúridos, son dos variedades diferentes. La primera descripción de este pez es obra de Block&Schneider en 1801, y su nombre Acanthurus coeruleus hace referencia a su cola espinosa (Acanthurus) y su color azul oscuro como el cielo (coereleus). El pez cirujano azul es morfológicamente muy interesante. Como todos los cirujanos, tiene un cuerpo aplanado, ligeramente ovalado y boca pequeña con dientes aserrados.", "Habitat", "comida"))
        animalesP?.add(Animal("Pámpano Palometa", R.drawable.pezcinco, R.drawable.palometa, "Trachinotus Falcatus", "Son de color brillantemente plateado; a menudo tiene tonos azules iridiscentes o azul verdoso sobre la cabeza y dorso; la barriga a menudo es amarillenta. El borde de la aleta dorsal es oscuro; ocasionalmente se encuentra una zona circular de color oscuro detrás de la base de la aleta pectoral; rara vez tiene la mancha oscura a mitad del cuerpo. El juvenil tiene un perfil casi circular con las aletas dorsal y anal elongadas.", "Habitat", "comida"))
        animalesP?.add(Animal("Caballito de Mar", R.drawable.pezseis, R.drawable.caballito, "Hippocampus reidi", "Este caballito de mar puede alcanzar los 15 o 20 cm de longitud. La característica que le da el nombre es un hocico largo y tubular, de mayor tamaño que el de otras especies. Otra característica que lo diferencia es la presencia de filamentos alargados en la cabeza, llamados “cirris”, muy característicos. Estos filamentos le ayudan a mimetizarse con las algas o plantas entre las que vive. Su coloración es entre marrón y negra, algo verdosos, rojizos o amarillentos en ocasiones, presentando frecuentemente motas blancas o azuladas.", "Habitat", "comida"))

        grid=findViewById<GridView>(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        adaptador =  AdaptadorCustomGrid(this, animalesP!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetallePez::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }
    }
}