/*
Exercício 7: Operação com Matriz
Faça um programa em Java que leia uma matriz de ordem 3 × 3 de números
inteiros. Em seguida, o programa deve calcular e exibir:
- A soma de todos os elementos da matriz.
- A soma dos elementos da diagonal principal.
- A soma dos elementos da diagonal secundária.
- A matriz transposta.

Exemplo de entrada:
1 2 3
4 5 6
7 8 9

Exemplo de saída:
Soma de todos os elementos = 45
Soma da diagonal principal = 15
Soma da diagonal secundária = 15

Matriz transposta =
1 4 7
2 5 8
3 6 9
*/
import java.util.Scanner;

public class ex7_Matriz {
    public static void main(String[] args) {
        int[][] matriz = new int [3] [3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira os valores: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz [i][j] = scanner.nextInt();
            }
        }
        int somaMatriz = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                somaMatriz += matriz[i][j];
            }
        }
        int somaPrincipal = 0;
        for (int i = 0; i < 3; i++){
            somaPrincipal += matriz[i][i];
        }
        int somaSecundaria = 0;
        for (int i = 0; i < 3; i++){
            somaSecundaria += matriz[i][2 - i];
        }
        System.out.println("\nMatriz transposta = ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matriz[j][i]);
            }
            System.out.println();
        }
        scanner.close();
        System.out.println("\nSoma de todos os elementos = " + somaMatriz);
        System.out.println("Soma da diagonal principal = " + somaPrincipal);
        System.out.println("Soma da diagonal secundária = " + somaSecundaria);
    }
}
