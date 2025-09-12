import java.util.Scanner;
import src.*;

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

        System.out.println("Insira a idade: ");
        int idade = scanner.nextInt();

        System.out.println("Insira o CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Insira o telefone: ");
        String telefone = scanner.nextLine();

        System.out.println("Insira o e-mail: ");
        String email = scanner.nextLine();

        System.out.println("Insira o nome da rua: ");
        String rua = scanner.nextLine();

        System.out.println("Insira o número: ");
        int numero = scanner.nextInt();

        System.out.println("Insira o complemento: ");
        String complemento = scanner.nextLine();

        System.out.println("Insira o bairro: ");
        String bairro = scanner.nextLine();

        System.out.println("Insira a cidade: ");
        String cidade = scanner.nextLine();

        System.out.println("Insira o estado: ");
        String estado = scanner.nextLine();

        System.out.println("Insira o CEP: ");
        String cep = scanner.nextLine();
    }

    private static void encerrarSistema() {
        System.out.println("Encerrando o sistema...");
        scanner.close();
    }
}
