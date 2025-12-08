package Exercicios;

public class Ex2_Conta {
    private int saldo;

    public Ex2_Conta(int saldo) {
        this.saldo = saldo;
    }

    public synchronized int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public synchronized int sacar(int valor) {
        if (saldo < valor) {
            return -1;
        }

        saldo -= valor;
        return saldo;
    }
}
