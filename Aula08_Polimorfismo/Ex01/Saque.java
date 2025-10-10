package Ex01;

class Saque extends Operacao {
    public double taxa;
    
    @Override
    public void executarOperacao(){
        double valorTotal = valor + taxa;
        System.out.println("Realizando saque...");
        System.out.println("Valor do saque: R$ " + String.format("%.2f", valor));
        System.out.println("Taxa cobrada:  R$ " + String.format("%.2f", taxa));
        System.out.println("Total debitado: R$ " + String.format("%.2f", valorTotal));
    }
}