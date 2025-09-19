/*
Crie uma classe Geometria com métodos area
sobrecarregados:
1 area(double lado) -> área de um quadrado.
2 area(double base, double altura) -> área de um
retângulo.
3 area(double raio, boolean circulo) -> área de um
círculo, quando circulo=true.
• No main, teste cada método e exiba os resultados.
 */

public class ex1_Geometria {
    public double area(double lado) {
        return lado * lado;
    }

    public double area(double base, double altura) {
        return base * altura;
    }

    public double area(double raio, boolean circulo) {
        double pi = 3.14;
        if (circulo) {
            return pi * (raio * raio);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        ex1_Geometria g = new ex1_Geometria();
        System.out.println(g.area(5));
        System.out.println(g.area(4, 3));
        System.out.println(g.area(6, true));
    }
}