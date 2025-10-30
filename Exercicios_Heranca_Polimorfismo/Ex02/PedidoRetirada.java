package Exercicios_Heranca_Polimorfismo.Ex02;

public class PedidoRetirada extends Pedido implements Entregavel {
    
    public PedidoRetirada(double valor, String descricao) {
        super(valor, descricao);
    }

    @Override
    public void resumo() {
        System.out.println(String.format("Descrição: %s\nValor: R$ %.2f", descricao, valor));
    }

    @Override
    public void entregar() {
        System.out.println("Retirada no balcão do estabelecimento.");
    }
}
