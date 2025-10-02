public class FiguraGeometrica {
    public static double Pi = 3.1359;

    public static void saudacao() {
        System.out.println("Boas-vindas.");
    }

    public double calcularArea(double paramUnico) {
        return Pi * (paramUnico * paramUnico);
    }

    public double calcularArea(double base, double altura) {
        return 0.0;
    }
}

class Retangulo extends FiguraGeometrica {
    @Override
    public double calcularArea(double largura, double altura) {
        return largura * altura;
    }
}

class Triangulo extends FiguraGeometrica {
    @Override
    public double calcularArea(double base, double altura) {
        return (base * altura) / 2;
    }
}

class Circulo extends FiguraGeometrica {
    @Override
    public double calcularArea(double raio) {
        return Pi * (raio * raio);
    }
}

class Calculator{
    public static void main(String[] args){
        FiguraGeometrica.saudacao();

        Retangulo ret = new Retangulo();
        System.out.println("Area do retangulo em cm²: " + ret.calcularArea(4, 3));

        Triangulo tri = new Triangulo();
        System.out.println("Area do triangulo em cm²: " + tri.calcularArea(4, 2));

        Circulo circ = new Circulo();
        System.out.println("Area do circulo em cm²: " + circ.calcularArea(4));

    }
}
