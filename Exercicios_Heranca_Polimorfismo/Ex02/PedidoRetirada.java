package Exercicios_Heranca_Polimorfismo.Ex02;

public class PedidoRetirada extends Pedido implements Entregavel {

    public PedidoRetirada(double valor, String descricao) {
        super(valor, descricao);
    }

    @Override
    public void resumo() {
        System.out.println("Resumo do(s) pedido(s) para retirada: ");
        System.out.println(String.format("Valor: %.2f\nDescricao: %s", valor, descricao));
    }

    public void entregar() {
        System.out.println("Retirada no balcao do estabelecimento: ");
    }
}
