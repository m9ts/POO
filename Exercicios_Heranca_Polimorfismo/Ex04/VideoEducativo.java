package Exercicios_Heranca_Polimorfismo.Ex04;

public class VideoEducativo extends Conteudo implements ConsultavelOnline {

    public VideoEducativo(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    public void exibirDetalhes() {
        System.out.println("------------ VÍDEO EDUCATIVO ------------");
        System.out.println(String.format("Título: %s\nAutor: %s\nAno de publicação: %d", titulo, autor, anoPublicacao));
    }

    public void visualizarOnline() {
        System.out.println("Visualização online do vídeo educativo disponibilizada!");
    }
    
}
