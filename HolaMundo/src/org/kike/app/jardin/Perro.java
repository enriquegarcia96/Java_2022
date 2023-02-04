package org.kike.app.jardin;

import org.kike.app.hogar.Persona;

public class Perro {

    protected  String nombre;
    protected  String raza;


    String jugar(Persona persona){
        return  persona.lanzarPelota();
    }


}
