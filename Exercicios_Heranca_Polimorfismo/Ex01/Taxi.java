package Exercicios_Heranca_Polimorfismo.Ex01;

public class Taxi extends VeiculoTransporte implements Abastecivel {

    public Taxi(String identificador, int capacidade) {
        super(identificador, capacidade);
    }

    @Override
    public void mover() {
        System.out.println("Levando passageiro ao destino.");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo com gasolina...");
    }
}
