package Ex02_Correcao;

public class TarefaComPrazo extends Tarefa implements Executavel {
    private String prazo;

    public TarefaComPrazo(String descricao, String prazo) {
        super(descricao);
        this.prazo = prazo;
    }

    @Override
    public String resumo() {
        return String.format("Tarefa com prazo: %s\nPrazo: %s", getDescricao(), getPrazo());
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    @Override
    public void executarTarefa() {
        System.out.println("Agendando uma tarefa...");
        ;
    }
}
