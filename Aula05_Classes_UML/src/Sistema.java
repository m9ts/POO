import java.util.Scanner;

public class Sistema {
    public static Scanner scanner = new Scanner(System.in);

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
        System.out.println("=== SISTEMA DE CADASTRO ===");
        System.out.println("1 - Cadastrar nova pessoa");
        System.out.println("2 - Sair");
        System.out.print("Opção: "); 
    }

    private static int lerOpcao() {
        int opcao = scanner.nextInt();
        scanner.nextLine();
        return opcao;
    }

    private static void cadastrarPessoa() {
        System.out.print("Digite o nome: "); 
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: "); 
        int idade = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Digite o CPF: "); 
        String cpf = scanner.nextLine();

        System.out.print("Digite o e-mail: "); 
        String email = scanner.nextLine();

        System.out.print("Digite o telefone: "); 
        String telefone = scanner.nextLine();

        System.out.print("Digite o nome da rua: "); 
        String rua = scanner.nextLine();

        System.out.print("Digite o número: "); 
        String numero = scanner.nextLine(); 

        System.out.print("Digite o complemento: "); 
        String complemento = scanner.nextLine();

        System.out.print("Digite o bairro: "); 
        String bairro = scanner.nextLine();

        System.out.print("Digite a cidade: "); 
        String cidade = scanner.nextLine();

        System.out.print("Digite o estado: "); 
        String estado = scanner.nextLine();

        System.out.print("Digite o CEP: "); 
        String cep = scanner.nextLine();

        System.out.print("É casa? (S/N): "); 
        String tipoImovel = scanner.nextLine();
        boolean casa = tipoImovel.toUpperCase().equals("S");

        if (validacao(nome, idade, cpf, email, telefone, rua, cidade)) {
            Contato contato = new Contato(email, telefone);
            Endereco endereco = new Endereco(rua, numero, complemento, bairro, cidade, estado, cep, casa);
            Pessoa pessoa = new Pessoa(nome, idade, cpf, contato, endereco);
            
            System.out.println(pessoa.apresentar() + "\n");
        } else {
            System.out.println("Erro! Dados incorretos. Tente novamente.\n");
        }
    }

    private static boolean validacao(String nome, int idade, String cpf, 
                                         String email, String telefone, String rua, String cidade) {
        
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome não pode estar vazio!");
            return false;
        }
        
        if (idade <= 0 || idade > 150) {
            System.out.println("Idade deve estar entre 1 e 150 anos!");
            return false;
        }
        
        if (cpf == null || cpf.replaceAll("\\D", "").length() != 11) {
            System.out.println("CPF deve ter 11 dígitos!");
            return false;
        }
        
        if (email == null || !email.contains("@") || !email.contains(".")) {
            System.out.println("E-mail inválido!");
            return false;
        }
        
        if (telefone == null || telefone.trim().isEmpty()) {
            System.out.println("Telefone não pode estar vazio!");
            return false;
        }
        
        if (rua == null || rua.trim().isEmpty()) {
            System.out.println("Rua não pode estar vazia!");
            return false;
        }
        
        
        if (cidade == null || cidade.trim().isEmpty()) {
            System.out.println("Cidade não pode estar vazia!");
            return false;
        }
        
        return true;
    }

    private static void encerrarSistema() {
        System.out.println("Encerrando o sistema...");
        scanner.close();
    }
}