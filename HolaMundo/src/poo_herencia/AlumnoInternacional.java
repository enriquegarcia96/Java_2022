package poo_herencia;

public class AlumnoInternacional extends Alumno {

    private String pais;
    private double notaIdioma;

    public AlumnoInternacional(){
        System.out.println("Alumno internacional: inicializando constructor...");
    }

    public  AlumnoInternacional(String nombre, String apellido){
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais){
        this(nombre,apellido);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdioma() {
        return notaIdioma;
    }

    public void setNotaIdioma(double notaIdioma) {
        this.notaIdioma = notaIdioma;
    }


}
