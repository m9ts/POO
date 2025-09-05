package ListaII_01.src.model;
import ListaII_01.src.model.Endereco;

public class Pessoa {
    String nome;
    int idade;
    private Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String exibirDados(){
        return "Nome: "+getNome() +"\nIdade: " +getIdade() +"\n\nEndereço:\n" +endereco.exibirEndereco(endereco.getRua(), endereco.getBairro(), endereco.getNumero());
    }
}
