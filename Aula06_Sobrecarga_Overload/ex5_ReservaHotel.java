/*
Implemente uma classe ReservaHotel com métodos
reservar sobrecarregados:
1 reservar(String nome) -> reserva padrão para 1 pessoa, 1
noite.
2 reservar(String nome, int noites) -> reserva para 1
pessoa, múltiplas noites.
3 reservar(String nome, int noites, int pessoas) ->
reserva para várias pessoas.
4 reservar(String nome, int noites, int pessoas,
boolean cafeIncluso) -> adiciona opção de café da manhã.
• No main, crie diferentes chamadas de reservar e exiba as
informações da reserva gerada.
• Desafio extra: usar ArrayList para armazenar todas as
reservas criadas e listar no final.
 */

public class ex5_ReservaHotel {
    public String reservar (String nome) {
        return "Reserva feita para " + nome;
    }

    public String reservar (String nome, int noites) {
        return "Reserva feita para " + nome + " por " + noites + " noites.";
    }

    public String reservar (String nome, int noites, int pessoas) {
        return "Reserva feita para " + nome + " por " + noites + " noites" + " e para " + pessoas + " pessoas.";
    }

    public String reservar (String nome, int noites, int pessoas, boolean cafeIncluso) {
        String reserva = "Reserva feita para " + nome + " por " + noites + " noites" + " e para " + pessoas + " pessoas ";

        if (cafeIncluso) {
            reserva = reserva + " | Possui café da manhã incluso.";
        } else {
            reserva = reserva + " | Não possui café da manhã incluso.";
        }
        return reserva;
    }

    public static void main(String[] args) {
        ex5_ReservaHotel ReservaHotel = new ex5_ReservaHotel();
        System.out.println("\n------RESERVAS REALIZADAS------\n");
        System.out.println(ReservaHotel.reservar("Roberto"));
        System.out.println(ReservaHotel.reservar("Cleiton", 3));
        System.out.println(ReservaHotel.reservar("Laura", 2, 2));
        System.out.println(ReservaHotel.reservar("Amanda", 3, 4, true));
    }
}
