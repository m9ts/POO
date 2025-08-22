/*
Faça um programa em Java que receba uma nota inteira de 0 a
100 via args[0] e classifique de acordo com a tabela:
• A -> 90 a 100
• B -> 80 a 89
• C -> 70 a 79
• D -> 60 a 69
• F -> menor que 60
Exemplo de execução:
• java Ex5 87
• Saída: B
*/

public class ClassificaNota {
    public static void main (String[] args) {
        if (args.length == 0) {
            System.out.println("Insira uma nota entre 0 e 100.");
            return;
        }

        int nota = Integer.parseInt(args[0]);

        if (nota < 0 || nota > 100) {
            System.out.println("Nota deve estar entre 0 e 100!");
            return;
        }

        if (nota >= 90) {
            System.out.println("A");
        } else if (nota >= 80) {
            System.out.println("B");
        } else if (nota >= 70) {
            System.out.println("C");
        } else if (nota >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}