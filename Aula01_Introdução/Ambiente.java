public class Ambiente {
    public static void main(String[] args) {
        String env = "PROD";
        if (args[0].length () > 0 && args[0].toUpperCase().equals(env)) { //Verifica se o argumento está vazio ou não e verifica se há PROD foi digitado como input.
            System.out.println("Ambiente de Produção.");
        } else {
            System.out.println("Ambiente de Desenvolvimento.");
        }
    }
}