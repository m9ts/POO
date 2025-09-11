package service;

import model.Endereco;
import model.Pessoa;

public class CadastroService {
    private Pessoa pessoa;

    public void cadastrarPessoa(String nome, int idade, String rua, String bairro, int numero) {
        Endereco endereco = new Endereco(rua, bairro, numero);
        pessoa = new Pessoa(nome, idade, endereco);
    }

    public void mostrarPessoa() {
        System.out.println(pessoa.exibirDados());
    }
}
