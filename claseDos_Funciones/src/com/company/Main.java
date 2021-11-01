package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(esPrimo(25));

    }

    public static boolean esDivisible (int numero1, int numero2){
        if (numero1 % numero2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean esPrimo(int numero) {
        int cont = 0;
        for (int i = 0; i < numero; i++) {
            if(esDivisible(numero, i+1)){
                cont = cont +1;
            }
        }
        if (cont == 2){
            return true;
        } else {
            return false;
        }
    }


}
