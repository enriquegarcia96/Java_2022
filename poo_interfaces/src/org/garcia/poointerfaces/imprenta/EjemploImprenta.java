package org.garcia.poointerfaces.imprenta;

import org.garcia.poointerfaces.imprenta.modelo.*;
import org.garcia.poointerfaces.imprenta.modelo.Hoja;
import static org.garcia.poointerfaces.imprenta.modelo.Genero.*;


public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo("Andrea caceres","Lic. Pedagogia", "Resume laboral...");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador fullstack")
                .addExperiencia("Angular");

        Libro libro = new Libro("Erich Gamma", "patrones de diseño: Elem. Reusables POO",
                PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron factory"))
                .addPagina(new Pagina("Composite"))
                .addPagina(new Pagina("Patron Facade"));

        Informe informe = new Informe( "Martin forler", "James", "Estudio sobre microservicios");

        imprimir(cv); // como tiene el contrato de la interface puede imprimir
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }

}
