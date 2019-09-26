package app;

public class Questao2 {
    public static void main(String[] args) throws Exception {
        
        Lampada lampa1 = new Lampada();
        Lampada lampa2 = new Lampada();

        lampa1.liga();
        lampa2.desliga();

        lampa1.observar();
        lampa2.observar();

    }
}