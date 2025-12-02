package Exercicios;

public class Ex1_Recurso {
    private int valor;

    public Ex1_Recurso(int valor) {
        this.valor = valor;
    }

    /*
     * synchronized evita:
     * - race conditions
     * - duas threads alterando this.valor ao mesmo tempo
     * - leituras inconsistentes
     */
    public synchronized void alterarRecurso(int valor) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " entrando - valor atual: " + this.valor);

        if (this.valor > valor) {
            this.valor -= valor;
            System.out.println(Thread.currentThread().getName() + " subtraiu - novo valor: " + this.valor);
            Thread.sleep(1000);
        }
        System.out.println(Thread.currentThread().getName() + " saindo - valor final: " + this.valor);
    }

    public int getValor() {
        return valor;
    }
}
