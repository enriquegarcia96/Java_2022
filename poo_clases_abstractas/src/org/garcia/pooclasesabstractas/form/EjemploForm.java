package org.garcia.pooclasesabstractas.form;

import org.garcia.pooclasesabstractas.form.elementos.*;
import org.garcia.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {

    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("Clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java)
                .addOpcion(new Opcion("2", "Python"))
                .addOpcion(new Opcion("3", "JavaScript"))
                .addOpcion(new Opcion("4", "TypeScript"))
                .addOpcion(new Opcion("5", "PHP"));


        username.setValor("Kike.doe");
        password.setValor("12345");
        email.setValor("kike@gmail.com");
        edad.setValor("27");
        experiencia.setValor("... mas de 10 años de experiencia ...");
        java.setSelected(true);

        // crea la lista
        List<ElementoForm> elementos = Arrays.asList(username, password, email, edad, experiencia, lenguaje);

        //lamda
        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br/>");
        });

    }

}
