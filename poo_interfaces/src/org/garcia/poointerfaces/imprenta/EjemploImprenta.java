package org.garcia.poointerfaces.imprenta;

import org.garcia.poointerfaces.imprenta.modelo.*;
import static org.garcia.poointerfaces.imprenta.modelo.Genero.*;
import static org.garcia.poointerfaces.imprenta.modelo.Imprimible.*;


public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo(new Persona("Andrea", "Caceres"),"Lic. Pedagogia", "Resume laboral...");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador fullstack")
                .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Enrique", "Garcia"), "patrones de diseño: Elem. Reusables POO",
                PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron factory"))
                .addPagina(new Pagina("Composite"))
                .addPagina(new Pagina("Patron Facade"));

        Informe informe = new Informe(
                        new Persona("Martin", "Fowler"),
                        new Persona("James", "Golis"),
                "Estudio sobre microservicios");

        imprimir(cv); // como tiene el contrato de la interface puede imprimir
        imprimir(informe);
        imprimir(libro);

        Imprimible objImp = new Imprimible(){
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto generico de una clase anonima";
            }
        };

        imprimir(objImp);
        System.out.println(TEXTO_DEFECTO);
    }



}
