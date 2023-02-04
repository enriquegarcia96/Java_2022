package TAREAS.herencia.verduras;

import java.security.NoSuchProviderException;

public class main {
    public static void main(String[] args) {

        Producto[] producto1 = new Producto[8];
        producto1[0] = new Lacteo("Leyde", 23, 3, 4);
        producto1[1] = new Lacteo("Sula", 30, 3, 80);
        producto1[2] = new Fruta("Manzana", 2, 3.2, "Rojo");
        producto1[3] = new Fruta("Pera", 23, 4.7, "Verde");
        producto1[4] = new Limpieza("Escoba", 45, "Para la casa", 4.7);
        producto1[5] = new Limpieza("Raid", 80, "Mata cucarachas", 2);
        producto1[6] = new NoPerecible("taco", 22, 2, 22);
        producto1[7] = new NoPerecible("jaja", 2, 33, 0);

        for(Producto pr: producto1){
            System.out.println("===========================================");
            System.out.println("Nombre: " + pr.getNombre());
            System.out.println("Precio: " + pr.getPrecio());

            if(pr instanceof Fruta){
                System.out.println("Peso " +  ((Fruta) pr).getPeso());
                System.out.println("Color : " + ((Fruta) pr).getColor());
            }

        }


    }
}
