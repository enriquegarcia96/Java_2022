package Operadores;

import javax.swing.*;

public class NombreMasLargo {

    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog("Nombre de la persona 1");
        String nombre2 = JOptionPane.showInputDialog("Nombre de la persona 2");
        String nombre3 = JOptionPane.showInputDialog("Nombre de la persona 3");

        nombre1.split(" ");
        nombre2.split(" ");
        nombre3.split(" ");

        if( nombre1.length() > nombre2.length() && nombre1.length() > nombre3.length() ){
            System.out.println(nombre1.concat(" tiene el nombre mas largo "));
        } else if (nombre2.length() > nombre1.length() && nombre2.length() > nombre3.length()) {
            System.out.println(nombre2.concat(" tiene el nombre mas largo "));
        } else if (nombre3.length() > nombre1.length() && nombre3.length() > nombre2.length()) {
            System.out.println(nombre3.concat(" tiene el nombre mas largo "));
        }
        

        String nombreMax = ( nombre1.length() < nombre2.length() ) ?
                nombre1  : nombre2;
        nombreMax = ( nombre3.length() < nombreMax.length() ) ?
                nombreMax : nombre3;


        System.out.println("La persona con el nombre mas largo es = " + nombreMax);





    }

}
