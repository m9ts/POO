/*
Exercício 2: Par ou ímpar
Escreva um programa que leia um valor inteiro do usuário e informe se o
número é par ou ímpar.
Exemplo de saída:
Digite um número: 7
O número 7 é ímpar.
*/

import java.util.Scanner;

public class ex2_ParOuImpar {
  public ex2_ParOuImpar() {
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.err.println("Digite um número: ");

    int numero = scanner.nextInt();
    if (numero % 2 == 0) {
      System.out.println("O número " + numero + " é par.");
    } else {
      System.out.println("O número " + numero + " é ímpar.");
    }
    scanner.close();
  }
}