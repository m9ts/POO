package Exercicios_Heranca_Polimorfismo.Ex04;

public abstract class Conteudo {
    public String titulo;
    public String autor;
    public int anoPublicacao;

    public Conteudo (String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public abstract void exibirDetalhes();
}
