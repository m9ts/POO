package Ex01;

class Transferencia extends Operacao {
    public String contaDestino;
    
    @Override
    public void executarOperacao(){
        System.out.println("\nRealizando transferencia...");
        System.out.println("Conta destino: " + contaDestino);
        System.out.println("Transferencia realizada: R$" + String.format("%.2f", valor));
    }
}