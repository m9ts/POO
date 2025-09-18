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
        System.out.println("Nome: ");
        System.out.println("Preço: ");
        System.out.println("Quantidade: ");
    }

    public static void main(String[] args) {
        ex3_Produto prod1 = new ex3_Produto();
        prod1.exibirInfo();
    }
}
