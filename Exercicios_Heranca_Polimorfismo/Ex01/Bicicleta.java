package Exercicios_Heranca_Polimorfismo.Ex01;

public class Bicicleta extends VeiculoTransporte {

    public Bicicleta(String identificador, int capacidade) {
        super(identificador, capacidade);
    }

    public void mover(){
        System.out.println("Sendo pedalada pelo ciclista...");
    }
}
