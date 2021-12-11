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

        System.out.println("-----------------");
        instituto1.generarInforme();

        Taller dt = (Taller) OfertaFactory.getInstance().crearOferta("Design Thinking");
        Taller uxui = (Taller) OfertaFactory.getInstance().crearOferta("UX/UI");

        Carrera ctd = (Carrera) OfertaFactory.getInstance().crearOferta("Certified Tech Developer");
        try {
            ctd.addOfertable(frontend);
            ctd.addOfertable(backend);
            ctd.addOfertable(dt);
            ctd.addOfertable(uxui);
        } catch (CarreraException e) {
            e.printStackTrace();
        }

        instituto1.agregarOfertaAcademica(dt);
        instituto1.agregarOfertaAcademica(uxui);
        instituto1.agregarOfertaAcademica(ctd);

        System.out.println("--------------");
        instituto1.generarInforme();

        System.out.println(ctd.toString());

        Curso menos10hs = (Curso) OfertaFactory.getInstance().crearOferta("menos10hs");
        System.out.println("La cantidad de horas totales del curso menos10hs son: " + menos10hs.getCargaHorariaTotal());

        try {
            ctd.addOfertable(menos10hs);
        } catch (CarreraException e){
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println(ctd.toString());

    }
}
