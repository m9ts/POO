/*
Faça um programa em Java que receba um número inteiro entre 0
e 9 via args[0] e exiba a palavra correspondente ao número.
Exemplo de execução:
• java Ex1 3
• Saída: três
*/

public class Correspondente {
    public static void main (String [] args) {
        if (args.length == 0) {
            System.out.println("Insira um número entre 0 e 9.");
            return;
        }

        int numero = Integer.parseInt(args[0]); // Converte texto em número para poder usar como índice do array.

        if (numero >= 0 && numero <= 9) {
            String[] palavras = {
                "zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"
            };
            System.out.println(palavras[numero]);
        } else {
            System.out.println("Incorreto! Insira um número entre 0 e 9.");
        }
    }
}