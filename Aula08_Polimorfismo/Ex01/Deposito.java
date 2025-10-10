package Ex01;

public class Deposito extends Operacao {

    @Override
    public void executarOperacao(){
        System.out.println("Realizando deposito...");
        System.out.println("Valor depositado: R$" + String.format("%.2f", valor));
    }
}