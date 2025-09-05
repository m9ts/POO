package ListaII_01.src;

import ListaII_01.src.service.CadastroService;

public class Main {
    public static void main(String[] args) {
        CadastroService cadastro = new CadastroService();

        cadastro.cadastrarPessoa("Jubileu", 38, "Rua Marte", "Via Lactea", 1990);
        cadastro.mostrarPessoa();
        
    }
}
