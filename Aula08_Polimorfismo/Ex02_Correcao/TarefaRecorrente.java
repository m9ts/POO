package Ex02_Correcao;

public class TarefaRecorrente extends Tarefa implements Executavel {
    private int diasRecorrente;

    public TarefaRecorrente(String descricao, int diasRecorrente) {
        super(descricao);
        this.diasRecorrente = diasRecorrente;
    }

    public int getDiasRecorrente() {
        return diasRecorrente;
    }

    public void setDiasRecorrente(int diasRecorrente) {
        this.diasRecorrente = diasRecorrente;
    }

    @Override
    public String resumo() {
        return String.format("Tarefa recorrente: %s a cada %s dia(s)", getDescricao(), getDiasRecorrente());
    }

    @Override
    public void executarTarefa() {
        System.out.println(String.format("Programando uma tarefa para executar em % dias", diasRecorrente));
    }
}
