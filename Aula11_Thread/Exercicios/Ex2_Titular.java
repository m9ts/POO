package Exercicios;

public class Ex2_Titular implements Runnable {
    private String nome;
    private Ex2_Conta conta;
    private int valorSaque;

    public Ex2_Titular(Ex2_Conta conta, int valorSaque, String nome) {
        this.conta = conta;
        this.valorSaque = valorSaque;
        this.nome = nome;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(nome + " tentando sacar R$ " + valorSaque);

            int novoSaldo = conta.sacar(valorSaque);

            if (novoSaldo >= 0) {
                System.out.println(nome + " realizou saque de R$ " + valorSaque + " | Saldo atual: R$ " + novoSaldo);
            } else {
                System.out.println(nome + " não conseguiu sacar. Saldo insuficiente.");
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
