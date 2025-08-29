/*
Exercício 3: Tipos de Triângulo

Leia três números inteiros a, b e c, representando os lados de um triângulo. Verifique se eles podem formar um triângulo e, caso positivo, indique se o triângulo é equilátero, isósceles ou escaleno.

Condição para formar um triângulo:

a + b > c e a + c > b e b + c > a

Classificação:

Equilátero: a = b = c

Isósceles: a = b ou a = c ou b = c

Escaleno: a ≠ b ≠ c

Exemplo de saída:
Digite os lados do triângulo: 5 5 8
Os lados formam um triângulo.
Tipo: Isósceles
*/

package Exercícios;
import java.util.Scanner;

public class ex3_Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Insira três valores: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Os lados formam um triângulo.");
            if (a == b && b == c) {
                System.out.println("Tipo: Equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Tipo: Isósceles.");
            } else {
                System.out.println("Tipo: Escaleno.");
            }
        } else {
            System.out.println("Os lados não formam um triângulo!");
        }
        scanner.close();
    }
}
