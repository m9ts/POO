package Exercicios_Heranca_Polimorfismo.Ex01;

public class Metro extends VeiculoTransporte {

    public Metro(String identificador, int capacidade) {
        super(identificador, capacidade);
    }

    @Override
    public void mover(){
        System.out.println("Deslizando sobre os trilhos...");
    }
}
