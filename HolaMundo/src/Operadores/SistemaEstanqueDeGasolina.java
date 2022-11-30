package Operadores;

import java.util.Scanner;

public class SistemaEstanqueDeGasolina {

    public static void main(String[] args) {

        Double capacidadTanque = 70.0;
        Double litrosGasolina = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la medida actual en litros");
        litrosGasolina = scanner.nextDouble();
        
        
        if (litrosGasolina == capacidadTanque){
            System.out.println("Es tanque lleno");
        } else if (litrosGasolina >= 60 && litrosGasolina <= capacidadTanque) {
            System.out.println("Es tanque casi lleno");
        } else if ( litrosGasolina >= 40 && litrosGasolina < 60 ) {
            System.out.println("Es tanque 3/4");
        } else if ( litrosGasolina >= 35 && litrosGasolina < 40 ) {
            System.out.println("Medio tanque");
        } else if ( litrosGasolina >= 20 && litrosGasolina < 35 ) {
            System.out.println("Suficiente");
        }else if( litrosGasolina >= 1 && litrosGasolina < 20 ){
            System.out.println("Insuficiente");
        }else {
            System.out.println("La capacidad del tanque solo es de 70 litros");
        }


    }

}
