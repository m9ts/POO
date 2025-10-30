package Exercicios_Heranca_Polimorfismo.Ex02;

public class PedidoDelivery extends Pedido implements Entregavel {

    public PedidoDelivery(double valor, String descricao) {
        super(valor, descricao);
    }

    @Override
    public void resumo() {
        System.out.println(String.format("Descrição: %s\nValor: R$ %.2f", descricao, valor));
    }

    @Override
    public void entregar() {
        System.out.println("Entrega via motoboy.");
    }
    
}
