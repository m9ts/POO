package model;

public class Endereco {
    String rua;
    String bairro;
    int numero;

    public Endereco(String rua, String bairro, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }
    public String exibirEndereco(String rua, String bairro, int numero){
        return "Rua: " +getRua() +"\nBairro: " +getBairro() +"\nNúmero: " +getNumero();
    }

    public String getRua(){
        return rua;
    }

    public String getBairro(){
        return bairro;
    }

    public int getNumero(){
        return numero;
    }
}
