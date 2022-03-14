package com.example.myapplication

class Animal(nombre:String, imagen:Int, imagenD:Int, nombreC:String, descripcion:String, habitat:String, alimentacion:String){
    var nombre:String = ""
    var imagen:Int = 0
    var imagenD:Int = 0
    var nombreC:String = ""
    var descripcion:String = ""
    var habitat:String = ""
    var alimentacion:String = ""


    init {
        this.nombre = nombre
        this.imagen = imagen
        this.imagenD = imagenD
        this.nombreC=nombreC
        this.descripcion = descripcion
        this.habitat = habitat
        this.alimentacion = alimentacion

    }
}