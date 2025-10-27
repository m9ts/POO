package Exercicios_Heranca_Polimorfismo.Ex04;

public class ArtigoCientifico extends Conteudo implements Baixavel{

    public ArtigoCientifico(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    public void exibirDetalhes() {
        System.out.println("------------ ARTIGO CIENTÍFICO ------------");
        System.out.println(String.format("Título: %s\nAutor: %s\nAno de publicação: %d", titulo, autor, anoPublicacao));
    }

    public void baixar() {
        System.out.println("Baixando arquivo(s) do(s) artigos(s) científico(s) selecionado(s)...");
    }
    
}
