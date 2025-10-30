package Exercicios_Heranca_Polimorfismo.Ex02;

public class PedidoLocal extends Pedido {
    
    public PedidoLocal(double valor, String descricao) {
        super(valor, descricao);
    }

    @Override
    public void resumo() {
        System.out.println(String.format("Descrição: %s\nValor: R$ %.2f", descricao, valor));
    }
}
