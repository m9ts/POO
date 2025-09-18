public class ex2_Calculadora {
    public int multiplica(int a, int b) {
        return a * b;
    }

    public double multiplica(double a, double b) {
        return a * b;
    }

    public void multiplica(int... nums) {
        System.out.println("multiplica(int...)");
    }

    public static void main(String[] args) {
        ex2_Calculadora calc = new ex2_Calculadora();
        System.out.println(calc.multiplica(2.0, 3.0));
        System.out.println(calc.multiplica(Integer.valueOf(1), Integer.valueOf(2)));
        System.out.println(calc.multiplica(4, 5));
        calc.multiplica(1, 3, 4);
    }
}