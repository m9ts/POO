package Exercicios_Heranca_Polimorfismo.Ex03;

public class FeiraGastronomica extends Evento {

    public FeiraGastronomica(String titulo, String local, int publicoEsperado) {
        super(titulo, local, publicoEsperado);
    }

    @Override
    public void exibirResumo() {
        System.out.println("------------FEIRA GASTRONOMICA------------");
        System.out
                .println(String.format("Titulo: %s\nLocal: %s\nPublico esperado: %d", titulo, local, publicoEsperado));
    }
}
