package Exercicios;

public class Ex1_MinhaTarefa implements Runnable {
    private Ex1_Recurso recurso;
    private int valor;

    public Ex1_MinhaTarefa(Ex1_Recurso recurso, int valor) {
        this.recurso = recurso;
        this.valor = valor;
    }

    public void run() {
        try {
            recurso.alterarRecurso(valor);
            System.out.println("Thread: " + Thread.currentThread().getName() + " | Valor: " + recurso.getValor());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
