package Exercicios_Heranca_Polimorfismo.Ex04;

public class Livro extends Conteudo implements Baixavel {

    public Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }
    
    public void exibirDetalhes() {
        System.out.println("------------ LIVRO ------------");
        System.out.println(String.format("Título: %s\nAutor: %s\nAno de publicação: %d", titulo, autor, anoPublicacao));
    }

    @Override
    public void baixar() {
        System.out.println("Baixando arquivo do(s) livro(s) selecionado(s)...");
    }
}
