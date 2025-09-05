package ListaII_01.src.service;

import ListaII_01.src.model.Endereco;
import ListaII_01.src.model.Pessoa;

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
