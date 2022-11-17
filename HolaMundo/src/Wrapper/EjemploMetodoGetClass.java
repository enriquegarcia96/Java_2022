package Wrapper;

import java.lang.reflect.Method;

public class EjemploMetodoGetClass {

    public static void main(String[] args) {

        String texto = "Hola que tal!";

        Class srtClass = texto.getClass();

        System.out.println("srtClass = " + srtClass.getName());
        System.out.println("srtClass = " + srtClass.getSimpleName());
        System.out.println("srtClass = " + srtClass.getPackageName());
        System.out.println("srtClass = " + srtClass);

        for (Method method: srtClass.getMethods() ){
            System.out.println("method = " + method.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass intClass.getSuperclass() = " + intClass.getSuperclass());
        System.out.println("intClass = " + intClass.getSuperclass().getSuperclass());

        for (Method method: objClass.getMethods()){
            System.out.println("method.getName() = " + method.getName());
        }


    }



}
