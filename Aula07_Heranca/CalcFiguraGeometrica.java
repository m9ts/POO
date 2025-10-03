class FiguraGeometrica {
    public static double Pi = 3.13159;

    public static void saudacao() {
        System.out.println("Boas-vindas!");
    }

    public double calcularArea(double paramUnico) {
        return Pi * (paramUnico * paramUnico);
    }

    public double calcularArea(double base, double altura) {
        return base * altura;
    }
}

class Circulo extends FiguraGeometrica {
    @Override
    public double calcularArea(double raio) {
        return Pi * (raio * raio);
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

public class CalcFiguraGeometrica {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        System.out.println("Area do circulo: " + circulo.calcularArea(5));

        Retangulo retangulo = new Retangulo();
        System.out.println("Area do retangulo: " + retangulo.calcularArea(3, 2));

        Triangulo triangulo = new Triangulo();
        System.out.println("Area do triangulo: " + triangulo.calcularArea(3, 2));
    }
}