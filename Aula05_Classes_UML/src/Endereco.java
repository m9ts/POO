public class Endereco {
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private boolean casa;

    public Endereco(String rua, String numero, String complemento, String bairro, String cidade, String estado, String cep, boolean casa) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.casa = casa;
    }

    public String mostrarEndereco() {
        String tipoImovel = casa ? "Casa" : "Apartamento";
        String enderecoCompleto = rua + ", " + numero + " - " + bairro + "| " + "CEP: " + cep + " | " + tipoImovel + " - " + complemento;

        enderecoCompleto += " | " + cidade + "/" + estado;
        return enderecoCompleto;
    }
}

