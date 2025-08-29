/*
Exercício 6: Sequência de Números
Leia uma sequência de números inteiros e imprima-os. Interrompa a leitura
quando o número lido for zero.
Restrição: Não teste a condição de parada em mais de um ponto do
programa e não escreva a operação de leitura em mais de um ponto.

Exemplo de saída:
Digite um número: 5
5
Digite um número: 7
7
Digite um número: 0
Fim da sequência.
*/

import java.util.Scanner;

public class ex6_Sequencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite um número: ");
            int num = scanner.nextInt();
            if (num == 0) break;
            System.out.println("Número digitado: " + num);
        }
        System.out.println("Fim da sequência.");
        scanner.close();
    }
}
