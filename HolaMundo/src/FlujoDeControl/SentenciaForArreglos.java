package FlujoDeControl;

import javax.swing.*;

public class SentenciaForArreglos {

    public static void main(String[] args) {

        String[] nombres = {"enrique", "Pepe", "Diana", "Omar", "Lalo", "Pato"};
        int count = nombres.length;
        for (int i = 0;  i < count; i++){
            if(nombres[i].toLowerCase().contains("ENRIQUE".toLowerCase()) ||
                nombres[i].toLowerCase().contains("PaTO".toLowerCase())){
                continue;
            }
            System.out.println( i + ".-" + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo  \"enrique\" o \"diana\":");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for(int i=0; i < count; i++){

            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }

        if(encontrado){
            JOptionPane.showMessageDialog(null, buscar.concat(" Fue encontrado"));
        }else {
            JOptionPane.showMessageDialog(null, buscar + " No existe en el sistema");
        }


    }
}
