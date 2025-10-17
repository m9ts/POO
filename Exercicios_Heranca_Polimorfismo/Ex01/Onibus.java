package Exercicios_Heranca_Polimorfismo.Ex01;

public class Onibus extends VeiculoTransporte implements Abastecivel {

    public Onibus(String identificador, int capacidade) {
        super(identificador, capacidade);
    }

    @Override
    public void mover(){
        System.out.println("Seguindo rota urbana.");
    }

    @Override
    public void abastecer(){
        System.out.println("Abastecendo com diesel...");
    }
}
