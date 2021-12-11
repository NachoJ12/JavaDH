package com.company;

public class OfertaFactory {
    private static OfertaFactory instance;

    private OfertaFactory(){
    }

    public static OfertaFactory getInstance(){
        if(instance == null)
            instance = new OfertaFactory();

        return instance;
    }

    public OfertaAcademica crearOferta(String tipoOferta){
        OfertaAcademica resultado = null;
        switch (tipoOferta){
            case "Front End":
                resultado = new Curso("Front End", "Curso completo de Front End", 1000.0, 16, 2);
                break;
            case "Back End":
                resultado = new Curso("Back End", "Curso completo de Back End", 900.0, 20, 2);
                break;
            case "menos10hs":
                resultado = new Curso("menos10hs", "Curso de menos de 10 horas", 200.0, 9, 1);
                break;
            case "FullStack":
                resultado = new Programa("Programa intensivo de Full Stack", "Durante nuestro curso, los estudiantes van a desarrollar un sitio web funcional desde cero. Comenzando con una introducción a estructuras lógicas de programación y la construcción de un servidor ligero con Node y Express. Posteriormente, sobre la base de una lógica de programación se construirá sin problemas un front-end robusto con componentes React y el back-end utilizando bases de datos relacionales y una autenticación de usuario adecuada bajo las mejores prácticas.(Digital House)", 20.0);
                break;
            case "Design Thinking":
                resultado = new Taller("Design Thinking", "La metodología llamada Design Thinking, tiene la particularidad de que se enfoca en la creatividad y la experiencia de los usuarios finales, en vez de poner la lupa en el negocio. (Digital House)", 16,270.0);
                break;
            case "UX/UI":
                resultado = new Taller("UX/UI", "Taller de UX/UI", 8, 625.0);
                break;
            case "Certified Tech Developer":
                resultado = new Carrera("Certified Tech Developer", "Carrera completa", 30000.0);
                break;
        }
        return resultado;
    }

}
