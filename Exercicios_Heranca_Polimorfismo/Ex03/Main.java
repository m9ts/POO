package Exercicios_Heranca_Polimorfismo.Ex03;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Evento> eventos = new LinkedList<>();

        eventos.add(new FeiraGastronomica("Sabores do Mundo 2025", "Parque da Cidade, Brasilia - DF", 5000));
        eventos.add(new ShowMusical("Noite do Rock Nacional", "Arena da Amazonia, Manaus - AM", 20000));
        eventos.add(new Congresso("Congresso Brasileiro de Inovacao e Tecnologia", "Centro de Convencoes de Sao Paulo - SP", 2000));
        eventos.add(new EncontroComunitario("Comunidade em Acao: Bairro Verde e Solidario", "Praca Central do Bairro Jardim Esperanca, Belo Horizonte - MG", 500));

        for (Evento evento : eventos) {
            evento.exibirResumo();
            evento.divulgar();

            // Verifica se o objeto evento pertence a uma classe que implementa a interface Transmitivel
            // antes de tentar chamar o método transmitir()
            if (evento instanceof Transmitivel) {
                ((Transmitivel) evento).transmitir(); // Downcasting para chamar o método transmitir()
            }
        }
    }
}
