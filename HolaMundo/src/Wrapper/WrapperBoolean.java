package Wrapper;

public class WrapperBoolean {

    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; // false
        Boolean objetoBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = true;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        System.out.println("comparando dos objetos boolean: " + (objetoBoolean == objBoolean2));
        System.out.println("Comparando dos objetos booleanos:  "  +  (objetoBoolean.equals(objBoolean2)));
        System.out.println("comparando dos objetos boolean: " + (objBoolean2 == objBoolean3));
        System.out.println("comparando dos objetos boolean: " + (objetoBoolean == objBoolean3));
        
        
        // forma explicita
        boolean primBoolean2 = objBoolean2.booleanValue();// obtenemos el valor boleano primitivo
        System.out.println("primBoolean2 = " + primBoolean2);


    }
}
