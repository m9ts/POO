package Exercicios_Heranca_Polimorfismo.Ex03;

public abstract class Evento {
    public String titulo;
    public String local;
    public int publicoEsperado;

    public Evento(String titulo, String local, int publicoEsperado) {
        this.titulo = titulo;
        this.local = local;
        this.publicoEsperado = publicoEsperado;
    }

    public abstract void exibirResumo();

    public void divulgar() {
        System.out.println("Venha para o evento!");
    }
}
