package Exercicios;

public class Ex3_MinhaThread extends Thread {
    private String nome;

    public Ex3_MinhaThread(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i < 6; i++) {
                System.out.println(nome + " | Contador: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(nome + " terminou de executar.");
    }
    
}
