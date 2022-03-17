package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class Artropodos : AppCompatActivity() {
    var grid: GridView?=null
    var adaptador:AdaptadorCustomGrid?=null
    companion object{
        var animalesA = ArrayList<Animal>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artropodos)
        animalesA= ArrayList()

        animalesA?.add(Animal("Langosta del Caribe", R.drawable.aruno, R.drawable.langosta,"Panulirus argus", "Es una especie de crustáceo decápodo del infraorden Palinura que vive en los arrecifes y manglares de la zona occidental del Océano Atlántico, tienen el cuerpo largo y cilíndrico cubierto de espinas. Dos espinas grandes apuntan hacia adelante como \"cuernos\" justo encima de cada tallo óptico. Por lo general son color verde oliva o marrón, pero pueden ser color caoba. Tienen manchas de color crema desparramadas sobre el caparazón y generalmente de cuatro a seis manchas grandes de color amarillo crema en el abdomen. Carecen de pinzas. ", "Habitat", "comida"))
        animalesA?.add(Animal("Araña Tejedora Espinosa", R.drawable.ardos, R.drawable.arana,"Gasteracantha cancriformis", "Es una especie de araña araneomorfa de la familia Araneidae, cuya tela presenta estabilimentos discontinuos en los bordes. La hembra tiene un abdomen ancho y con 6 espinas,  por lo general colocadas dos hacia cada lado y otras dos hacia atrás. El color de los individuos puede variar entre amarillo, blanco, anaranjado y rojo. Estos colores son acompañados de una serie de manchas negras en toda la superficie. El macho es de menor tamaño, con espinas menos acentuadas que la hembra y no posee una coloración muy marcada, además de esto, normalmente defeca de color verde.", "Habitat", "comida"))
        animalesA?.add(Animal("Cangrejo Herradura", R.drawable.artres, R.drawable.cangrejo, "Limulus polyphemus", "El cangrejo herradura del Atlántico o cangrejo cacerola es una especie de quelicerado de la clase Merostomata. Llega a alcanzar 60 cm de largo y 30 cm de ancho. A pesar de su nombre, esta especie está más próxima a las arañas y escorpiones (arácnidos), que a los cangrejos (crustáceos), con los que no guarda ninguna relación. Habita en las zonas costeras y los estuarios fluviales.", "Habitat", "comida"))
        animalesA?.add(Animal("Cangrejo Azul", R.drawable.arcuatro, R.drawable.jaiba, "Callinectes sapidus", "La jaiba es un crustáceo decápodo nativo de la costa occidental del océano Atlántico. Su cuerpo está cubierto de un exoesqueleto color verde oscuro. Su caparazón puede crecer hasta un ancho de 23 cm. Los machos y las hembras de la jaiba se pueden distinguir por el dimorfismo sexual en la forma del abdomen (delantal): es largo y delgado (estrecho) en los machos, pero ancho y redondeado en las hembras maduras. Los cambios del abdomen de las hembras se ven a medida que estas maduran: en las hembras inmaduras, el abdomen tiene forma triangular, mientras que en las maduras es redondo.", "Habitat", "comida"))
        animalesA?.add(Animal("Abeja Melipona", R.drawable.arcinco, R.drawable.abeja, "Melipona", "La abeja melipona es una especie sin aguijón que cultivan los pueblos mayas desde hace cientos de años y la  denominan “abeja sagrada maya”, por la propiedades curativas que tiene su miel. Tal es la importancia de las abejas que los mayas,en la época prehispánica, realizaban en su honor entre cuatro y seis ceremonias al año. La principal característica de la abeja melipona es que no tiene aguijón, pero para defender su colonia “muerde” todo aquello que represente una amenaza, se aferran de tal manera que mueren durante el combate.", "Habitat", "comida"))
        animalesA?.add(Animal("Alacrán café esbelto", R.drawable.arseis, R.drawable.alacran, "Centruroides gracilis", "Alacrán de tamaño grande-mediano, en el caso de la hembra, puede llegar hasta los 10 centímetros y hasta 15 en los machos, llega a ser rojizo y negro rojizo o con secciones rojizas y cola negra. Una hembra puede llegar a luz entre 25 y 35 crías en promedio, aunque pueden llegar a morir en algunos casos al momento de realizar la muda de piel. Se alcanza la madurez en alrededor de 300 días en hembras y 235 en machos. Se adapta muy bien al calor en climas de 30° C, desérticos y secos, se refugia en cortezas, trozos de madera y rocas. ", "Habitat", "comida"))


        grid=findViewById<GridView>(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        adaptador =  AdaptadorCustomGrid(this, animalesA!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleArtropodo::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }
    }
}