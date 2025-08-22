/*
Faça um programa em Java que receba um caractere via args[0] e
verifique se ele é uma letra maiúscula ou minúscula. Além disso,
exiba a letra convertida (maiúscula em minúscula, ou vice-versa).
Exemplo de execução:
• java Ex3 a
• Saída: minúscula -> A
*/

public class Verifica {
    public static void main (String[] args) {
        if (args.length == 0) {
            System.out.println("Digite um caractere.");
            return;
        }
        
        char c = args[0].charAt(0);

        if (!Character.isLetter(c)) {
            System.out.println("Não é uma letra! Tente digitar uma letra do alfabeto.");
            return;
        }

        if (Character.isUpperCase(c)) {
            System.out.println("Maiúscula para minúscula -> " + Character.toLowerCase(c));
        } else {
            System.out.println("Minúscula para maiúscula -> " + Character.toUpperCase(c));
        }
    }
}