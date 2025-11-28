import java.time.LocalTime;

public class MinhaThread extends Thread {
    private Recurso recurso;
    private int valor;

    public MinhaThread(String name) {
        setName(name);
        start();
    }

    public MinhaThread(String name, Recurso recurso, int valor) {
        this.valor = valor;
        this.recurso = recurso;
        setName(name);
        start();
    }

    @Override
    public void run() {
        try {
            recurso.alterarRecurso(valor);
            System.out.println("Recurso: " + Thread.currentThread().getName() + " | Valor: " + recurso.getValor());
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }

    // @Override
    // public void run() {
    //     for (int i = 0; i < 10; i++) {
    //         System.out.println(
    //                 "Minha Thread: " + Thread.currentThread().getName() + " | Contador: " + i + " | Tempo: " + LocalTime.now());
    //         try {
    //             sleep(1000);
    //         } catch (InterruptedException e) {
    //             throw new RuntimeException(e);
    //         }
    //     }
    // }
    
}