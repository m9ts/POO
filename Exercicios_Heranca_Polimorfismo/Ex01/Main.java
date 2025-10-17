package Exercicios_Heranca_Polimorfismo.Ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<VeiculoTransporte> frota = new ArrayList<>();

        frota.add(new Onibus("Onibus 101", 40));
        frota.add(new Taxi("Taxi XPTO", 4));
        frota.add(new Metro("Metro Linha Azul", 300));
        frota.add(new Bicicleta("Bike VikingX", 1));

        for (VeiculoTransporte veiculo : frota) {
            veiculo.mostrarInfo();
            veiculo.mover();

            if (veiculo instanceof Abastecivel) {
                ((Abastecivel) veiculo).abastecer();
            }
            System.out.println("------------------------");
        }
    }
}
