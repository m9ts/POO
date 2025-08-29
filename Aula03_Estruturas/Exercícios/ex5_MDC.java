/*
Exercício 5: Máximo Divisor Comum (MDC)
Leia dois números inteiros x e y e calcule o máximo divisor comum
(MDC) usando o algoritmo de Euclides, mostrando passo a passo as operações.
Operações matemáticas:
resto = x mod y, x = y, y = resto
Repita enquanto y ̸= 0. Quando y = 0, x é o MDC.
Exemplo de cálculo:
36 mod 60 = 36, 60 mod 36 = 24, 36 mod 24 = 12, 24 mod 12 = 0
MDC = 12

Exemplo de saída:
Digite dois números: 36 60
Operações:
36 % 60 = 36
60 % 36 = 24
36 % 24 = 12
24 % 12 = 0
MDC = 12
*/

import java.util.Scanner;

public class ex5_MDC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira dois números: ");

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("Operações: ");
        while (y != 0) {
            int resto = x % y;
            System.out.println(x + " % " + y + " = " + resto);
            x = y;
            y = resto;
        }
        System.out.println("MDC = " + x);
    }
}
