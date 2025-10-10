class Transferencia extends Operacao implements Operavel{
    public String contaDestino;
    
    public void executarOperacao(){
        System.out.println("Transferencia realizada: R$" + valor);
    }
}