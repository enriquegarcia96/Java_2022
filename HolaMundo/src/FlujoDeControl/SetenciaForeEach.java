package FlujoDeControl;

public class SetenciaForeEach {
    public static void main(String[] args) {
        int [] numeros = {1,3,5,7,9,11,13,15};
        String[] nombres = {"enrique", "Pepe", "Diana", "Omar", "Lalo", "Pato"};


        for(int num: numeros){
            System.out.println("num = " + num);
        }
        
        
        for(String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }
        
    }
}
