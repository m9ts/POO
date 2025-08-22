/*
Extrair último algarismo e três últimos algarismos de um número long.
Obs.: Sem utilizar loops ou condicionais.
*/

public class Ex3 {
    public static void main (String[] args) {
        long numero =  63274682736234L;
        int x = 0, y = 0;

        x = (int) (numero%10); //Isola a parte decimal do long, que no caso é o resto 4, o último.
        
        y = (int) (numero%1000); //Isola a parte milhar do long, que no caso são os números 234, os 3 últimos.

        System.out.println("O último algarismo é: " + x);
        System.out.println("Os três últimos algarismos são: " + y);
    }
}