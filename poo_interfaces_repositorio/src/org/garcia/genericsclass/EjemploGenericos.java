package org.garcia.genericsclass;

import org.garcia.generics.Animal;
import org.garcia.generics.Automovil;
import org.garcia.generics.Maquinaria;

public class EjemploGenericos {

    public static <T> void imprimirCamion(Camion<T> camion){
        for(T t: camion){
            if(t instanceof Animal){
                System.out.println(((Animal) t).getNombre() + " Tipo " + ((Animal) t).getTipo());
            }

            if( t instanceof Maquinaria ){
                System.out.println(((Maquinaria)t).getTipo());
            }

            if( t instanceof  Automovil){
                System.out.println(((Automovil)t).getMarca());
            }
        }
    }

    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Peregrino", "Caballo"));
        transporteCaballos.add(new Animal("grillo", "Caballo"));
        transporteCaballos.add(new Animal("Tunquen", "Caballo"));
        transporteCaballos.add(new Animal("Topocalma", "Caballo"));
        transporteCaballos.add(new Animal("Longotoma", "Caballo"));

        imprimirCamion(transporteCaballos);


        Camion<Maquinaria> transMaquinas = new Camion<>(3);
        transMaquinas.add(new Maquinaria("Bulldozer"));
        transMaquinas.add(new Maquinaria("Grua horquilla"));
        transMaquinas.add(new Maquinaria("Perforadora"));

        imprimirCamion(transMaquinas);

        Camion<Automovil> trnsAuto = new Camion<>(3);
        trnsAuto.add(new Automovil("Toyota"));
        trnsAuto.add(new Automovil("Nissan"));
        trnsAuto.add(new Automovil("Civic"));

        imprimirCamion(trnsAuto);

    }

}
