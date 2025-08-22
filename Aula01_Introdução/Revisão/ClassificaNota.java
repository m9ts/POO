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
            System.out.println("Insira um número entre 0 e 100.");
            return;
        }

    }
}