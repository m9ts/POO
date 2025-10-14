abstract class Tarefa implements Executavel {
    public String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public void resumo() {
        System.out.println("\n----- RESUMO DA TAREFA -----");
        System.out.println("Descricao: " + descricao + "\n--------------------\n");
    }
}