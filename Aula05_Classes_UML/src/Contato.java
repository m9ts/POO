public class Contato {
    private String email;
    private String telefone;

    public Contato(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    public String mostrarContato() {
        return String.format("Email: %s\nTelefone: %s",email, telefone);
    }
}
