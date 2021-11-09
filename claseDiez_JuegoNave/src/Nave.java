public class Nave extends Objeto{
    private double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, double velocidad) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
    }

    @Override
    public void irA(int x, int y, char direccion) {
        if (getDireccion() != direccion){
            girar(direccion);
        }
        System.out.println("Ir a X: "+ x + ", Y:"+y+ ", en dirección: " + direccion);
    }

    public void girar(char direccion){
        System.out.println("Giro al " + direccion);
    }

    public double restarVida(int valor){
        return this.vida -= valor;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
