/*
Exercício 4: Números Primos
Leia um número inteiro n e imprima os n primeiros números primos.
Operação matemática: Um número p > 1 é primo se não possui divisores além de 1 e p:
∀d ∈ {2, 3, . . . , p − 1}, p mod d ̸= 0

Exemplo de saída:
Digite n: 5
Os primeiros 5 números primos são: 2, 3, 5, 7, 11 
*/

import java.util.Scanner;

public class ex4_Primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite quantos primos quer ver: ");
        int n = scanner.nextInt();

        int encontrados = 0;
        int numero = 2;

        System.out.println("Os primeiros " + n + " números primos são: ");
        while (encontrados < n) {
            if (checkPrimo(numero)) {
                System.out.print(numero + " ");
                encontrados++;
            }
            numero++;
        }
        scanner.close();
    }

    public static boolean checkPrimo(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
