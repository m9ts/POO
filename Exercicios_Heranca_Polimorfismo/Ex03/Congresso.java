package Exercicios_Heranca_Polimorfismo.Ex03;

public class Congresso extends Evento implements Transmitivel {

    public Congresso(String titulo, String local, int publicoEsperado) {
        super(titulo, local, publicoEsperado);
    }

    @Override
    public void exibirResumo() {
        System.out.println("------------CONGRESSO------------");
        System.out.println(String.format("Titulo: %s\nLocal: %s\nPublico esperado: %d", titulo, local, publicoEsperado));
    }

    @Override
    public void transmitir() {
        System.out.println("Transmitido pelo canal oficial Congresso Brasileiro de Inovacao e Tecnologia TV");
    }
}
