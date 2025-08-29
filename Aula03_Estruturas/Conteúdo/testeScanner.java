import java.util.Scanner;

// Programa que lê números inteiros digitados pelo usuário e imprime até que o número 0 seja digitado
public class testeScanner {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do teclado
        System.err.println("Digite um número: ");

        while (scanner.hasNext()) {
            int value = scanner.nextInt(); // Lê o próximo número inteiro digitado pelo usuário
            if (value == 0) break;
            System.out.println("Valor digitado: " + value);
        }
        scanner.close();
    }
}

