package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class Reptiles : AppCompatActivity() {var grid:GridView?=null
    var adaptador:AdaptadorCustomGrid?=null
    companion object{
        var animalesR = ArrayList<Animal>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reptiles)
        animalesR= ArrayList()

        animalesR?.add(Animal("Nauyaca", R.drawable.reptiltres, R.drawable.nauyaca, "Bothrops asper", "Es una de las especies de serpientes con mayor dimorfismo sexual. Las serpientes de ambos sexos nacen con el mismo tamaño, pero entre los 7 a 12 meses de edad las hembras comienzan a crecer más rápidamente que los machos. En general, los adultos miden entre 140-180 cm. Los machos nunca alcanzan más de 195 cm de longitud, mientras que las hembras tienen un tamaño promedio de 185 cm, con una longitud máxima confirmada de 250 cm." +
                "\n" + "El patrón de color se asemeja al de Bothrops atrox: rayas diagonales y diamantes de varios tonos de marrón. La parte inferior de la cabeza es amarillo pálido. Las serpientes recién nacidas son de color más brillante y los machos juveniles tienen la punta de la cola amarilla.", " ", " "))
        animalesR?.add(Animal("Cantil", R.drawable.reptilseis, R.drawable.cantil,"Agkistrodon bilineatus", "Esta serpiente es de cuerpo robusto, pero la cola es relativamente larga y extendida. El tamaño del cuerpo puede alcanzar los 100 cm de longitud. La cabeza es larga y bien diferenciada del cuello, el ojo es de tamaño mediano con una pupila vertical. La parte superior de la cabeza esta cubierta de escamas grandes, generalmente nueve, pero las parietales algunas veces están fragmentadas en pequeñas escamas. ", "Habitat", "comida"))
        animalesR?.add(Animal("Iguana Rayada", R.drawable.reptilcinco, R.drawable.iguana,  "Ctenosaura similis", "La iguana negra de cola espinosa tiene escamas negras distintivas con quillas en sus largas colas , lo que les da su nombre común. Ellos, junto con C. pectinata , son los miembros más grandes del género Ctenosaura. Los machos son capaces de crecer hasta 1,3 metros (4 pies 3 pulgadas) de largo y las hembras son un poco más cortas, de 0,8 a 1 metro (2 pies 7 pulgadas a 3 pies 3 pulgadas). Tienen una cresta de largas espinas que se extiende por el centro de la espalda.  ", "Habitat", "comida"))
        animalesR?.add(Animal("Tortuga Verde", R.drawable.reptildos, R.drawable.tortuga, "Chelonia mydas", "La tortuga verde es una especie típica de aguas tropicales, es la tortuga marina que presenta mayor número de hembras reproductoras a nivel mundial y es la segunda especie más abundante del Mediterráneo. Su nombre se explica por el color de su grasa subcutánea. La tortuga verde es la más grande de la familia cheloniidae, oscila entre 90 cm y 160 cm, su peso puede variar entre 80 kg y 150 kg.El plastrón suele ser amarillo pálido. Las crías de colores más oscuros presentan un reborde blanco en su caparazón y sus aletas.", "Habitat", "comida"))
        animalesR?.add(Animal("Cocodrilo de Río", R.drawable.reptiluno, R.drawable.cocodrilo, "Crocodylus acutus", "Es un gran reptil de la familia de los Crocodílidos, que se distingue por el gran tamaño adquirido por los adultos (generalmente entre 3 y 4 m. pero llegando hasta 7.5 m), los recién nacidos con una longitud de 25 a 30 cm. El hocico alargado notablemente, presentando dientes; 5 dientes premaxilares, 13 maxilares y 15 mandibulares. La coloración dorsal es grisácea en los adultos y gris con tonos verdes en los juveniles, presentan flecos y manchas oscuras y el vientre no tiene marcas, su musculosa y gruesa cola; presentan una abertura anal dispuesta longitudinalmente.", "Habitat", "comida"))
        animalesR?.add(Animal("Toloque Rayado", R.drawable.reptilcuatro, R.drawable.toloque, "Basiliscus vittatus", "El toloque rayado, también conocido como basilisco marrón, basilisco rayado, pasa ríos rayado, tequereque, tenguereche o turipaché, es una especie de la familia Corytophanidae. El macho puede alcanzar 61 cm de longitud total, la hembra es más pequeña. Pesa de 200 - 600 g. Posee cresta dorsal en cabeza, espalda y cola.", "Habitat", "comida"))


        grid=findViewById<GridView>(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        adaptador =  AdaptadorCustomGrid(this, animalesR!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleReptil::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }
    }
    }
