public class Endereco {
    private String rua;
    private String cidade;

    public Endereco(String rua, String cidade) {
        this.rua = rua;
        this.cidade = cidade;
    }

    public String mostrarEndereco() {
        return String.format("Rua: %s\n Cidade: %s", rua, cidade);
    }
}
