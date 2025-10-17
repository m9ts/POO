package Exercicios_Heranca_Polimorfismo.Ex01;

public abstract class VeiculoTransporte {
    public int capacidade;
    public String identificador;

    public VeiculoTransporte(String identificador, int capacidade){
        this.identificador = identificador;
        this.capacidade = capacidade;
    }

    public String getIdentificador(){
        return getIdentificador();
    }

    public void setIdentificador(String identificador){
        this.identificador = identificador;
    }

    public int getCapacidade(){
        return getCapacidade();
    }

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

    public abstract void mover();

    public void mostrarInfo(){
        System.out.println(String.format("Identificador: %s%nCapacidade: %d", identificador, capacidade));
    }
}
