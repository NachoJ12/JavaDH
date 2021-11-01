package com.company;

public class UsuarioJuego {
    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;

    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0.0;
        this.nivel = 0;
    }

    public void aumentarPuntaje(){
        this.puntaje ++;
    }

    public void subirNivel(){
        this.nivel ++;
    }

    public void bonus(int valor){
        this.puntaje += valor;
    }

    //para ver sus atributos
    public void mostrarPuntaje() {
        System.out.println("El puntaje actual es de: " + this.puntaje);
    }

    public void mostrarNivel() {
        System.out.println("El nivel actual es de: " + this.nivel);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
