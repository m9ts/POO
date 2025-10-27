package Exercicios_Heranca_Polimorfismo.Ex04;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Conteudo> conteudos = new LinkedList<>();

        conteudos.add(new Livro("O estrangeiro", "Albert Camus", 1942));
        conteudos.add(new ArtigoCientifico("The Impact of Social media on Academic Performance of University Students", "John A. Smith", 2022));
        conteudos.add(new Revista("A revolução da inteligência artificial na educação", "Maria Fernanda Costa", 2023));
        conteudos.add(new VideoEducativo("Introdução à Programacao em Python", "Gustavo Guanabara", 2020));

        for (Conteudo conteudo : conteudos) {
            conteudo.exibirDetalhes();

            if (conteudo instanceof Baixavel) { // verifica se o objeto implementa a interface Baixavel
                ((Baixavel) conteudo).baixar(); // faz o downcasting e chama o método baixar()
            }
            
            if (conteudo instanceof ConsultavelOnline) {
                ((ConsultavelOnline) conteudo).visualizarOnline();
            }
        }
    }
}
