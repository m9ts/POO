package Exercicios_Heranca_Polimorfismo.Ex04;

public class Revista extends Conteudo implements ConsultavelOnline {

    public Revista(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    public void exibirDetalhes() {
        System.out.println("------------  REVISTA ------------");
        System.out.println(String.format("Título: %s\nAutor: %s\nAno de publicação: %d", titulo, autor, anoPublicacao));
    }

    public void visualizarOnline() {
        System.out.println("Visualização online da revista disponibilizada!");
    }
    
}
