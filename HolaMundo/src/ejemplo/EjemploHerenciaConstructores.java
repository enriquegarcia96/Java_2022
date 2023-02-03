package ejemplo;

import poo_herencia.Alumno;
import poo_herencia.AlumnoInternacional;
import poo_herencia.Persona;
import poo_herencia.Profesor;

public class EjemploHerenciaConstructores {

    public static void main(String[] args) {


        System.out.println("========== Creando la instancia de la clase Alumno ==========");

        Alumno alumno = new Alumno("Enrique", "Garcia", 13, "Insituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("kike@gmail.com");
        //((Alumno)alumno).setInstitucion("Froylan turcios"); // para castear la clase

        System.out.println("========== Creando la instancia de la clase Alumno Internacional  ==========");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Andrea", "Caceres", "Honduras");
        alumnoInternacional.setEdad(15);
        alumnoInternacional.setInstitucion("Ramon Rosa");
        alumnoInternacional.setNotaIdioma(6.8);
        alumnoInternacional.setNotaCastellano(6.2);
        alumnoInternacional.setNotaHistoria(5.8);
        alumnoInternacional.setNotaMatematica(6.5);
        alumnoInternacional.setEmail("internacional@gmail.com");

        System.out.println("========== Creando la instancia de la clase Profesor ==========");
        Profesor profesor = new Profesor("Omar", "Carlos", "Programacion");
        profesor.setEdad(37);
        profesor.setEmail("profe@gmail.com");

        System.out.println("========== Creando - ==========");
        imprimir(alumno);
        imprimir(alumnoInternacional);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona) {
        System.out.println("Imprimiendo datos en comun del tipo de persona: ");
        System.out.println("nombre: " + persona.getNombre() +
                ", apellido: " + persona.getApellido() +
                ", edad:  " + persona.getEdad()
                + ", email: " + persona.getEmail());

        if(persona  instanceof Alumno){
            System.out.println("Imprimiendo los datos del tipo alumno: ");
            System.out.println("Institucion: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota matematicas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota castellado: " +  ((Alumno) persona).getNotaCastellano());

            if(persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional: ");
                System.out.println("Nota idiomas: " + ((AlumnoInternacional) persona).getNotaIdioma());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("=====================  sobre escritura promedio ===============");
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
        }

        if(persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo Profesor: ");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());

        }
        System.out.println("================= sobre escritura saludar ==================");
        System.out.println(persona.saludar());

        System.out.println("===================================");

    }

}
