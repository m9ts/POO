package Exercicios_Heranca_Polimorfismo.Ex03;

public class ShowMusical extends Evento implements Transmitivel {

    public ShowMusical(String titulo, String local, int publicoEsperado) {
        super(titulo, local, publicoEsperado);
    }

    @Override
    public void exibirResumo() {
        System.out.println("------------SHOW MUSICAL------------");
        System.out.println(String.format("Titulo: %s\nLocal: %s\nPublico esperado: %d", titulo, local, publicoEsperado));
    }

    @Override
    public void transmitir() {
        System.out.println("Transmitido pelo canal oficial Noite do Rock Nacional TV.");
    }
}
