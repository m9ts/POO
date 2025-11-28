public class Recurso {
    private int valor;

    public Recurso(int valor) {
        this.valor = valor;
    }

    public void alterarRecurso(int valor) throws InterruptedException {
        if (this.valor > valor) {
            this.valor -= valor;
            Thread.sleep(1000);
        }
    }

    public int getValor() {
        return valor;
    }
}
