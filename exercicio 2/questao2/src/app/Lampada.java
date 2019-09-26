package app;

public class Lampada {
    Boolean ligado;

    public void liga () {
        ligado = true;
    }

    public void desliga () {
        ligado = false;
    }

    public void observar () {
        if (ligado == true) System.out.println("ligada");
        else System.out.println("desligada");
    }
}