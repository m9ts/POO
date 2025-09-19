/*
Crie uma classe Calculadora com métodos multiplica
sobrecarregados:
1 multiplica(int a, int b).
2 multiplica(double a, double b).
3 multiplica(int... valores) usando varargs.
• Implemente no main testes para ver qual sobrecarga é
escolhida em cada chamada.
 */

public class ex2_Calculadora {
    public int multiplica(int a, int b) {
        return a * b;
    }

    public double multiplica(double a, double b) {
        return a * b;
    }

    public int multiplica(int... nums) {
        int resultado = 1;

        for (int i = 0; i< nums.length; i++){
            resultado *= nums[i];
        }
        return resultado;
    }

    public static void main(String[] args) {
        ex2_Calculadora calc = new ex2_Calculadora();
        System.out.println(calc.multiplica(2.0, 3.0));
        System.out.println(calc.multiplica(Integer.valueOf(1), Integer.valueOf(2)));
        System.out.println(calc.multiplica(4, 5));
        System.out.println(calc.multiplica(1, 3, 4));
    }
}