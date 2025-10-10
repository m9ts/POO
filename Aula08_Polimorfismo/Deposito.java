public class Deposito extends Operacao implements Operavel{

    public void executarOperacao(){
        System.out.println("Realizando deposito...");
        System.out.println("Valor depositado: R$" + valor);
    }
}