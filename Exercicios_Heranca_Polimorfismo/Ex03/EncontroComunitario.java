package Exercicios_Heranca_Polimorfismo.Ex03;

public class EncontroComunitario extends Evento {
    
    public EncontroComunitario(String titulo, String local, int publicoEsperado) {
        super(titulo, local, publicoEsperado);
    }

    @Override
    public void exibirResumo(){
        System.out.println("------------ENCONTRO COMUNITARIO------------");
        System.out.println(String.format("Titulo: %s\nLocal: %s\nPublico esperado: %d", titulo, local, publicoEsperado));
    }
}
