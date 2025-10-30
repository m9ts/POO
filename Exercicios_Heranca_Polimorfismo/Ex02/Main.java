package Exercicios_Heranca_Polimorfismo.Ex02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();

        pedidos.add(new PedidoDelivery(45.50, "Double cheese burger"));
        pedidos.add(new PedidoRetirada(40.99, "Chicken burger"));
        pedidos.add(new PedidoLocal(35.00, "Smash cheddar burger"));

        for (Pedido pedido : pedidos) {
            pedido.resumo();

            if (pedido instanceof Entregavel) {
                ((Entregavel) pedido).entregar();
            } else {
                System.out.println("Pedido servido na mesa.");
            }

            if (pedido instanceof PedidoDelivery) {
                System.out.println("Taxa de serviço: R$ " + pedido.calcularTaxaServico());
            }
            System.out.println("----------------------------");
        }
    }
}
