public class incrExplo {
    public static void main (String[] args) {
        int a, b, c;
        b = c = 10;
        a = b++ + b++; // Acessa primeiro o valor do b e depois vai para o próximo comando, então ficaria 10 + 11
        System.out.println("Valor de a = " + a);
        System.out.println("Valor de b = " + b);
        a = ++c + ++c;
        System.out.println("Valor de a = " + a);
        System.out.println("Valor de c = " + c);
        a = 10;
        b = 5;
        boolean x = a > b || b++ > 3; // Ou exclusivo, basta uma condição ser verdadeira para validá-la.
        System.out.println("Valor de x = " + x);
        System.out.println("Valor de b = " + b);
        a = b++ + b;
        System.out.println("Valor de a = " + a);
        System.out.println("Valor de b = " + b);
    }
}