package com.company;
import java.time.LocalDateTime;

public class Perro {
    private String nombre;
    private Boolean enAdopcion;
    private String raza;
    private int añoNacimiento;
    private Double peso;
    private Boolean tieneChip;
    private Boolean lastimado;


    public Perro(String nombre, String raza, int añoNacimiento, Double peso, Boolean chip, Boolean lastimado) {
        this.nombre = nombre;
        this.enAdopcion = false;
        this.raza = raza;
        this.añoNacimiento = añoNacimiento;
        this.peso = peso;
        this.tieneChip = chip;
        this.lastimado = lastimado;
    }

    public Perro (String nombre, Double peso, Boolean lastimado) {
        this.nombre = nombre;
        this.enAdopcion = false;
        this.tieneChip = false;
        this.peso = peso;
        this.lastimado = lastimado;
    }

    public void edadPerro (){
        System.out.println( "La edad del perro " + getNombre() + " es: " + (LocalDateTime.now().getYear() - añoNacimiento) + " año/s");
    }

    public void sePuedePerder(){
        if (this.tieneChip){
            System.out.println(getNombre() + " no se puede perder");
        } else {
            System.out.println(getNombre() + " se puede perder");
        }
    }

    public void enviarAdopcionPerro (){
        if (!this.lastimado && this.peso>5){
            this.enAdopcion = true;
            System.out.println(getNombre() + " se puede adoptar");
        } else {
            System.out.println(getNombre() + " no se puede adoptar");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEnAdopcion() {
        return enAdopcion;
    }

    public void setEnAdopcion(Boolean enAdopcion) {
        this.enAdopcion = enAdopcion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Boolean getChip() {
        return tieneChip;
    }

    public void setChip(Boolean chip) {
        this.tieneChip = chip;
    }

    public Boolean getLastimado() {
        return lastimado;
    }

    public void setLastimado(Boolean lastimado) {
        this.lastimado = lastimado;
    }
}
