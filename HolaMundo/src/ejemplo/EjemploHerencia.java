package ejemplo;
import poo_herencia.*;

public class EjemploHerencia {

    public static void main(String[] args) {

        Alumno alumno = new Alumno();
        alumno.setNombre("Enrique");
        alumno.setApellido("Garcia");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        //((Alumno)alumno).setInstitucion("Froylan turcios"); // para castear la clase

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("Andrea");
        alumnoInternacional.setApellido("Caceres");
        alumnoInternacional.setPais("Honduras");
        alumnoInternacional.setEdad(15);
        alumnoInternacional.setInstitucion("Ramon Rosa");
        alumnoInternacional.setNotaIdioma(6.8);
        alumnoInternacional.setNotaCastellano(6.2);
        alumnoInternacional.setNotaHistoria(5.8);
        alumnoInternacional.setNotaMatematica(6.5);

        Profesor profesor = new Profesor();
        profesor.setNombre("Omar");
        profesor.setApellido("Carlos");
        profesor.setAsignatura("Programacion");

        System.out.println(alumno.getNombre() + "  "  +  alumno.getApellido()+  "  "  +
                alumno.getInstitucion());

        System.out.println(alumnoInternacional.getNombre() +
        "" +  alumnoInternacional.getApellido()
        + "" + alumnoInternacional.getPais());

        System.out.println("Profesor " + profesor.getAsignatura() + " " + profesor.getNombre() + "  "  +  profesor.getApellido());


        Class clase = alumnoInternacional.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();

            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }

    }
}
