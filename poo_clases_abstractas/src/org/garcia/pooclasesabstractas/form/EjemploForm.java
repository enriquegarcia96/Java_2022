package org.garcia.pooclasesabstractas.form;

import org.garcia.pooclasesabstractas.form.elementos.*;
import org.garcia.pooclasesabstractas.form.elementos.select.Opcion;
import org.garcia.pooclasesabstractas.form.validador.*;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {

    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("Clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        lenguaje.addOpcion(new Opcion("1", "Java"))
                .addOpcion(new Opcion("2", "Python"))
                .addOpcion(new Opcion("3", "JavaScript"))
                .addOpcion(new Opcion("4", "TypeScript").setSelected())
                .addOpcion(new Opcion("5", "PHP"));

        ElementoForm saludar = new ElementoForm("saludo"){

            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+ this.nombre+"' value=\""+ this.valor +"\"  />";
            }

        };

        saludar.setValor("Hola que tal este campo esta desabilitado!");
        username.setValor("Kike.doe");
        password.setValor("a1b2c3");
        email.setValor("kike@gmail.com");
        edad.setValor("27");
        experiencia.setValor("... mas de 10 años de experiencia ...");
        //java.setSelected(true);

        // crea la lista
        List<ElementoForm> elementos = Arrays.asList(username, password, email, edad, experiencia, lenguaje, saludar);

        //lada
        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br/>");
        });

        elementos.forEach(e -> {
            if(!e.esValido()){
                e.getErrores().forEach(System.out::println);
            }
        });

    }

}