package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Pedir el nombre de la mascota
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la mascota");
        String nombreMascota = scanner.nextLine();

        // Pedir cuanto come la mascota
        System.out.println("Ingrese cuanto come la mascota");
        Double comidaNecesariaMascota = scanner.nextDouble();

        // Calcular los paquetes que necesito
        Integer paquetesNecesarios = cuantosPaquetesNecesito(comidaNecesariaMascota);

        //salida
        System.out.println("Cuantos paquetes necesito para alimentar a la mascota: " + paquetesNecesarios);
    }

    public static int cuantosPaquetesNecesito(Double comidaNecesariaMascota){
        Scanner scannerPaquetePeso = new Scanner(System.in);
        int cantidadPaquetes = 0;
        Double comidaActual = 0.0;

        while (comidaActual < comidaNecesariaMascota){
            System.out.println("Ingrese el peso del  paquete ");
            Double pesoPaquete = scannerPaquetePeso.nextDouble();
            comidaActual += pesoPaquete;
            cantidadPaquetes++;
        }
        return cantidadPaquetes;
    }
}
