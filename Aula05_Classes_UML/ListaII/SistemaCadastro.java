
import java.util.Scanner;

class Contato {
    private String email;
    private String telefone;
    
    public Contato(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }
    
    public String mostrarContato() {
        return "E-mail: " + email + "\nTelefone: " + telefone;
    }
}

class Endereco {
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private boolean casa; 
    
    public Endereco(String rua, String numero, String complemento, String bairro, 
                   String cidade, String estado, String cep, boolean casa) {
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
        String enderecoCompleto = rua + ", " + numero + ", " + bairro + 
                                 ", CEP: " + cep + ", " + tipoImovel;
        
        if (!complemento.trim().isEmpty()) {
            enderecoCompleto += " - " + complemento;
        }
        
        enderecoCompleto += ", " + cidade + "/" + estado;
        
        return enderecoCompleto;
    }
}

class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private Contato contato;
    private Endereco endereco;

    public Pessoa(String nome, int idade, String cpf, Contato contato, Endereco endereco){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.contato = contato;
        this.endereco = endereco;
    }

    public String apresentar() {
        return "Cadastro realizado com sucesso!\n" +
                "Nome" + nome + "\n" +
                "Idade" + idade + " anos\n" +
                "CPF: " + cpf + "\n" +
                contato.mostrarContato() + "\n" +
                "Endereço: " + endereco.mostrarEndereco();
    }
}

public class SistemaCadastro {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bem-vindo(a) ao Sistema de Cadastro de Pessoas");

        while (true) {
            Menu();
            int opcao = lerOpcao();

            switch (opcao) {
                case 1: 
                    cadastrarPessoa();
                    break;
                case 2: 
                    encerrarSistema();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private static void Menu() {
        System.out.println("SISTEMA DE CADASTRO");
        System.out.println("1 - Cadastrar pessoa");
        System.out.println("2 - Sair do menu");
        System.out.println("Opção: ");
    }

    private static int lerOpcao() {
        int opcao = scanner.nextInt();
        scanner.nextLine();
        return opcao;
    }

    private static void cadastrarPessoa() {
        System.out.println("Insira o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Insira a idade:");
        int idade = scanner.nextInt();
        scanner.nextLine();
        
    }
}