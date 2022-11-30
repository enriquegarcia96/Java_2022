package ValorvsReferencia;

class Persona{

    private String nombre;

    public void modificarNombres(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return  this.nombre;
    }
}


public class PasarPorReferenvia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombres("Enrique");

        System.out.println("iniciamos en main");

        System.out.println("persona.nombre = " + persona.leerNombre());

        System.out.println("Antes de llamar al metodo test ");
        test(persona);
        System.out.println(" Despues de llamar al metodo test ");

        System.out.println("persona.leerNombre() = " + persona.leerNombre());

        System.out.println("finaliza el método main con los datos de la persona modificados ");

    }

    public  static void test(Persona persona){
        System.out.println("Iniciamos el metodo test");
        persona.modificarNombres("García");
        System.out.println("finaliza el metodo test");
    }

}
