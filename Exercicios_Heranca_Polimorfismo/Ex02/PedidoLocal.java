package Exercicios_Heranca_Polimorfismo.Ex02;

public class PedidoLocal extends Pedido {
    
    public PedidoLocal(double valor, String descricao) {
        super(valor, descricao);
    }

    @Override
    public void resumo(){
        System.out.println("Resumo do(s) pedido(s) servido(s) na mesa: ");
        System.out.println(String.format("Valor: %.2f\nDescricao: %s", valor, descricao));
    }
}
