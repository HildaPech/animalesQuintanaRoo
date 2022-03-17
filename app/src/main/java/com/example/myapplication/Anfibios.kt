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

        animalesE?.add(Animal("Sapo Costero", R.drawable.anuno, R.drawable.sapocostero,"Incilius valliceps", "El sapo de la costa del Golfo es una especie de sapo nativo de México y América Central. También se le conoce como sapo, sapo común, sapo costero o sapo del golfo. Pertenece al género Incilius (sapos centroamericanos) y a la familia Bufonidae. Alcanza una longitud hocico cloaca de entre 7 y 8 cm. Su cuerpo es robusto, ligeramente aplanado, con brazos cortos y patas traseras musculosas. Su piel es rugosa y cubierta de tubérculos. Los machos posee un saco gular con el que cantan para llamar a las hembras. ", "Habitat", "comida"))
        animalesE?.add(Animal("Rana de árbol de Ojos Rojos", R.drawable.andos, R.drawable.rana,"Agalychnis callidryas", "La rana verde de ojos rojos o rana de ojos rojos es una especie de anfibio anuro de la familia de Hylidae. Lo más notable son sus grandes ojos rojos con pupila vertical. Como adultos llegan a tener colores brillantes sobre todo su cuerpo. Predomina el verde, pero usualmente presentan otros colores como azul o amarillo. Las patas delanteras presentan un azul brillante, mientras que las traseras son rojas o anaranjadas.  ", "Habitat", "comida"))
        animalesE?.add(Animal("Salamanquesa", R.drawable.antres, R.drawable.salamanquesa, "Bolitoglossa mexicana", "La salamanquesa es una especie de salamandras en la familia Plethodontidae. Habita en Belice, Guatemala, Honduras, México y posiblemente en Nicaragua. Su hábitat natural son los bosques secos tropicales o subtropicales, bosques húmedos a baja altitud, los montanos húmedos tropicales o subtropicales, plantaciones y jardines rurales. Está amenazada de extinción debido a la destrucción de su hábitat.", "Habitat", "comida"))
        animalesE?.add(Animal("Rana arbórea locuaz", R.drawable.ancuatro, R.drawable.ranaarborea, "Tlalocohyla loquax", "Las ranas rabóreas locuaz son ranas de tamaño mediano, un macho adulto puede llegar a medir 45 mm en total y las hembras, teniendo mayor tamaño, llegan a medir hasta 47mm. Su actividad es completamente nocturna, se desplaza en los árboles y su alimentación son insectos principalmente. Su temporada de reproducción comienza en Julio y Agosto, justo en las temporadas de lluvias. Cada una contiene 250 huevos, que se agarra a la vegetación encontrada alrededor del agua de la superficie.", "Habitat", "comida"))
        animalesE?.add(Animal("Rana Termitera", R.drawable.ancinco, R.drawable.ranatermitera, "Hypopachus variolosus", "La rana termitera es una especie de anfibio anuro de la familia Microhylidae.  Se distribuye desde Costa Rica hasta el sur de Texas. Su rango altitudinal va desde el nivel del mar a los 2100 m de altitud.", "Habitat", "comida"))
        animalesE?.add(Animal("Salamandra Lengua de Hongo", R.drawable.anseis, R.drawable.salamandra, "Bolitoglossa yucatana", "Son de tamaño mediano y de cuerpo esbelto, los adultos tienen una longitud hocico-cloaca de 5.3 cm en promedio. La cola es más o menos tan larga como el cuerpo y algunas veces está hinchada con grandes depósitos de grasa, como una adaptación para la época seca. La cabeza es algo aplanada y se distingue claramente del cuello. Tiene un pliegue gular visible.  La coloración dorsal es predominantemente gris, café o café rojizo, con un moteado irregular crema o bronceado claro. Los costados son café oscuro uniforme generalmente. La garganta y el vientre son color café o bronceado uniforme.", "Habitat", "comida"))


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
