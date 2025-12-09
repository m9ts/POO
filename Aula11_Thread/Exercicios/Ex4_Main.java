package Exercicios;

public class Ex4_Main {
    public static void main(String[] args) {
        Thread corredor1 = new Thread(new Ex4_Corredor("Corredor 1"));
        Thread corredor2 = new Thread(new Ex4_Corredor("Corredor 2"));
        Thread corredor3 = new Thread(new Ex4_Corredor("Corredor 3"));

        System.out.println("Começando a corrida...");
        corredor1.start();
        corredor2.start();
        corredor3.start();
        
        
    }
}
