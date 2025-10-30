package Exercicios_Heranca_Polimorfismo.Ex02;

public abstract class Pedido {
    public double valor;
    public String descricao;

    public Pedido(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public abstract void resumo();

    public double calcularTaxaServico() {
        return valor * 0.10;
    }
}
