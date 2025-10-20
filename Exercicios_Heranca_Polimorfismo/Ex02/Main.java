package Exercicios_Heranca_Polimorfismo.Ex02;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pedido> pedidos = new LinkedList<>();

        pedidos.add(new PedidoDelivery(65.00, "Ultra burger w/ Coke"));
        pedidos.add(new PedidoLocal(45.00, "Combo double burger cheddar"));
        pedidos.add(new PedidoRetirada(30.90, "Smash chicken burger"));

        for (Pedido pedido : pedidos) {
            pedido.resumo();

            // Verifica se o pedido é do tipo PedidoDelivery para aplicar a taxa de serviço
            if (pedido instanceof PedidoDelivery) {
                System.out.println("Valor com taxa: R$" + pedido.calcularTaxaServico());
            }

            if (pedido instanceof Entregavel) {
                ((Entregavel) pedido).entregar(); // Downcasting para chamar o método entregar()
            }
            System.out.println("--------------------------");
        }
    }
}
