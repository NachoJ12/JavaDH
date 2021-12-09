package com.company;

public class Main {

    public static void main(String[] args) {

        Curso frontend = (Curso) OfertaFactory.getInstance().crearOferta("Front End");
        System.out.println("El valor del curso Front End es de: " + frontend.calcularPrecio());

        Curso backend = (Curso) OfertaFactory.getInstance().crearOferta("Back End");
        System.out.println("El valor del curso Back End es de: " + backend.calcularPrecio());

        Programa fullstack = (Programa) OfertaFactory.getInstance().crearOferta("FullStack");
        fullstack.addOfertable(frontend);
        fullstack.addOfertable(backend);
        System.out.println("El valor del programa Full Stack es de: " + fullstack.calcularPrecio());

        Instituto instituto1 = new Instituto("Digital House");
        instituto1.agregarOfertaAcademica(frontend);
        instituto1.agregarOfertaAcademica(backend);
        instituto1.agregarOfertaAcademica(fullstack);


        System.out.println("\n" + instituto1.generarInforme());

    }
}
