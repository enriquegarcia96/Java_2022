package TAREAS.herencia;

public class Cliente extends Persona {

    private int clienteId;
    private static int id;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion){
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = ++id;
    }



    public int getClienteId(){
        return this.clienteId;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCliente{" +
                "clienteId=" + clienteId +
                '}';
    }
}
