package Exercicios_Heranca_Polimorfismo.Ex02;

public class PedidoDelivery extends Pedido implements Entregavel {

    public PedidoDelivery(double valor, String descricao) {
        super(valor, descricao);
    }

    @Override
    public void resumo(){
        System.out.println("Resumo do(s) pedido(s) delivery: ");
        System.out.println(String.format("Valor: %.2f\nDescricao: %s", valor, descricao));
    }

    @Override
    public void entregar(){
        System.out.println("Entrega por motoboy.");
    }
}
