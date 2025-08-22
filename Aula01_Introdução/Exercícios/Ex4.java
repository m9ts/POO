/*
Crie um arquivo para a classe abaixo e o compile. Explique o que ocorreu. Faça a
correção devida e execute-o.
*/

//Qualquer operação de byte, resulta na conversão de um inteiro, isso para evitar o overflow.

public class Ex4 {
    public static void main (String[] args) {
        byte a, b, c;

        b = 10;
        c = 15;
        a = (byte) (b + c); //Casting para forçar o retorno com byte.

        System.out.println("Um byte: " + a);
    }
}