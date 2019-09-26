package app;

public class Questao4 {
    public static void main(String[] args) {
        UsaQuadrado q1 = new UsaQuadrado(2);
        UsaQuadrado q2 = new UsaQuadrado(4);
        UsaQuadrado q3 = new UsaQuadrado(5);

        System.out.println("q1 area: " + q1.area());
        System.out.println("q1 perimetro: " + q1.perimetro());
        System.out.println("q2 area: " + q2.area());
        System.out.println("q2 perimetro: " + q2.perimetro());
        System.out.println("q3 area: " + q3.area());
        System.out.println("q3 perimetro: " + q3.perimetro());
    }
}