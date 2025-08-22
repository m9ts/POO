/*
Mude 'A' no programa por 'AA' e compile-o. Agore mude 'AA' por "A". Compile
novamente.
*/

public class Ex2 {
    public static void main (String[] args) {
        char ch = '\u0061'; // Na tabela ASCII, é o escape "a". | Já "AA" é uma string.
        System.out.println("Um caractere: " + ch);
    }
}