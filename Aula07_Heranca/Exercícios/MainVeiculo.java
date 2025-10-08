class Veiculo {
    String marca;
    String modelo;
    String cor;
    int ano;
    boolean motorLigado;

    Veiculo(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.motorLigado = false;
    }

    void ligarMotor() {
        this.motorLigado = true;
    }

    void desligarMotor() {
        this.motorLigado = false;
    }

    void exibirInfo() {
        System.out.println(
                "Marca: " + marca +
                        "\nModelo: " + modelo +
                        "\nCor: " + cor +
                        "\nAno: " + ano +
                        "\nMotor ligado: " + ((motorLigado ? "Sim" : "Nao"))

        );
    }
}

class CarroPasseio extends Veiculo {
    private int capacidadePassageiros;

    CarroPasseio(String marca, String modelo, String cor, int ano, int capacidade) {
        super(marca, modelo, cor, ano);
        this.capacidadePassageiros = capacidade;
    }

    void buzinar() {
        System.out.println("Foooooon!");
    }

    @Override
    void exibirInfo() {
        super.exibirInfo();
        System.out.println("Capacidade de passageiros: " + capacidadePassageiros);
    }
}

class Caminhonete extends Veiculo {
    private double capacidadeCargaKg;
    private boolean tracao4x4;

    Caminhonete(String marca, String modelo, String cor, int ano, double carga, boolean tracaoInteg) {
        super(marca, modelo, cor, ano);
        this.capacidadeCargaKg = carga;
        this.tracao4x4 = tracaoInteg;
    }

    void engatar4x4() {
        if (!tracao4x4) {
            System.out.println("Esse veiculo não possui tracao integral!");
        } else {
            System.out.println("Tracao integral ativada!");
        }
    }

    @Override
    void exibirInfo() {
        super.exibirInfo();
        System.out.println("Capacidade de carga: " + capacidadeCargaKg + " kg" + "\nTracao: "
                + (tracao4x4 ? "4x4" : "Sem tracao 4x4"));
    }
}

public class MainVeiculo {
    public static void main(String[] args) {
        Veiculo veiculoBase = new Veiculo("BMW", "M2 Competition", "Azul", 2025);
        System.out.println("--------- Veiculo base ---------");
        veiculoBase.ligarMotor();
        veiculoBase.exibirInfo();

        CarroPasseio veiculoPasseio = new CarroPasseio("Ford", "Landau", "Preto", 1979, 2);
        System.out.println("\n--------- Veiculo de passeio ---------");
        veiculoPasseio.exibirInfo();
        veiculoPasseio.buzinar();

        Caminhonete caminhonete = new Caminhonete("Toyota", "Hilux", "Prata", 2024, 1010, true);
        System.out.println("\n--------- Caminhonete ---------");
        caminhonete.ligarMotor();
        caminhonete.exibirInfo();
        caminhonete.engatar4x4();
    }
}