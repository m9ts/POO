class Alguem {
    String nome;

    public Alguem() {
        nome = "Alguém";
    }

    public void getNome() {
        System.out.println(nome);
    }

    public void getNome(String sobrenome) {
        System.out.println(String.format("%n %n", nome, sobrenome));
    }
}

class Melissa extends Alguem {
    private String sobrenome;

    public Melissa() {
        super.nome = "Melissa";
        sobrenome = "Silva";
    }

    @Override
    public void getNome() {
        System.out.println(this.nome.concat(" " + sobrenome));
    }

}

class Alcebiades extends Alguem {
    public Alcebiades() {
        super();
    }

    @Override
    public void getNome(String sobrenome) {
        System.out.println(String.format("Alcebiades %s filho de %s", sobrenome, nome));
    }

}

public class Exemplo {
    public static void main(String[] args) {
        Alguem obj1 = new Alguem();
        obj1.getNome();

        Melissa obj2 = new Melissa();
        obj2.getNome();

        Alcebiades obj3 = new Alcebiades();
        obj3.getNome("Thedore");

        Alguem obj4 = new Melissa();
        obj4.getNome();

        Alguem obj5 = new Alcebiades();
        obj5.getNome("Theodore");
    }
}