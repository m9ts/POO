public class Pessoa {
    private String nome;
    private String idade;
    private String cpf;
    private Contato contato;
    private Endereco endereco;

    public Pessoa(String nome, String idade, String cpf, Contato contato, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.contato = contato;
        this.endereco = endereco;
    }

    public String apresentar() {
        return String.format("Cadastro realizado com sucesso!\n");
    }
}

public String apresentar() {
    return "Cadastro realizado com sucesso!\n" +
            "Nome" + nome + "\n" +
            "Idade" + idade + " anos\n" +
            "CPF: " + cpf + "\n" +
            contato.mostrarContato() + "\n" +
            "Endereço: " + endereco.mostrarEndereco();
}
