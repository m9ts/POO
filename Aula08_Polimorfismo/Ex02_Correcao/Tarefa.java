package Ex02_Correcao;

public abstract class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public abstract String resumo(); // todos os tipos de tarefas implementarão esse método

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}