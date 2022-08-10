package Operadores;
import java.util.Scanner;

public class OperadoresLogicosLogin {

    public static void main(String[] args) {
      /*  String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "kike";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "pepe";
        passwords[2] = "12345"; */

        String [] usernames = {"kike", "admin", "pepe"};
        String [] passwords = {"12345","12345","12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el username");
        String u = scanner.next();

        System.out.println("ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++){
            if(usernames[i].equals(u) && passwords[i].equals(p)){
                esAutenticado = true;
                break;
            }
        }



        if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else{
            System.out.println("lo siento, requiere  autenticación");
            System.out.println("username   o contraseña incorrectos");
        }
    }
}
