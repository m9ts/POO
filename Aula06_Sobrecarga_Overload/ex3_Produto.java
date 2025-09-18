public class ex3_Produto {
    String nome;
    double preco;
    int quantidade;

    public ex3_Produto () {
        this.nome = "Desconhecido";
        this.preco = 0.0;
    }

    public ex3_Produto (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public ex3_Produto (String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("-----------");
    }

    public static void main(String[] args) {
        ex3_Produto prod1 = new ex3_Produto();
        prod1.exibirInfo();

        ex3_Produto prod2 = new ex3_Produto("Detergente", 7.00);
        prod2.exibirInfo();

        ex3_Produto prod3 = new ex3_Produto("Amaciante", 20.00, 1);
        prod3.exibirInfo();
    }
}
