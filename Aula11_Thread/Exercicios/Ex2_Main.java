package Exercicios;

public class Ex2_Main {
    public static void main(String[] args) throws InterruptedException {
        Ex2_Conta conta = new Ex2_Conta(200);
    
        Thread titular1 = new Thread(new Ex2_Titular(conta, 50, "Mateus"));
        Thread titular2 = new Thread(new Ex2_Titular(conta, 50, "Cleiton"));

        titular1.start();
        titular2.start();

        titular1.join();
        titular2.join();

        System.out.println("\nSaldo final da conta: R$ " + conta.getSaldo());
    }
    
}
