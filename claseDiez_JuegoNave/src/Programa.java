public class Programa {
    public static void main(String[] args) {

        Nave nave1 = new Nave(40, 10,'N', 200.0);
        nave1.irA(80,50,'S');
        nave1.setVida(100);
        nave1.restarVida(20);
        System.out.println(nave1.getVida());


    }
}
