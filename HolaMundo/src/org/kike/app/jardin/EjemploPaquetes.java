package org.kike.app.jardin;

import org.kike.app.hogar.*;
import  static org.kike.app.hogar.Persona.*;
import static org.kike.app.hogar.ColorPelo.*;

public class EjemploPaquetes {

    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("kike");
        p.setApellido("Garcia");
        p.setColorPelo(COLORIN);
        System.out.println(p.getNombre());


        Perro perro = new Perro();
        perro.nombre = "Toby";
        perro.raza = "aguazatero";


        String jugando = perro.jugar(p);
        System.out.println("Jugando = " + jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;

    }


}
