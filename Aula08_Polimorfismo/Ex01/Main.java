package Ex01;

public class Main {
    public static void main(String[] args) {
        Saque saque = new Saque();
        saque.valor = 100.0;
        saque.taxa = 15.00;
        saque.executarOperacao();
        saque.resumo();

        System.out.println("\n");

        Deposito deposito = new Deposito();
        deposito.valor = 200.50;
        deposito.executarOperacao();
        deposito.resumo();

        System.out.println("\n");

        Transferencia transferencia = new Transferencia();
        transferencia.valor = 505.55;
        transferencia.contaDestino = "99894-3";
        transferencia.executarOperacao();
        transferencia.resumo();

        System.out.println("\n");
    }
}
