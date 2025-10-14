public class TarefaRecorrente extends Tarefa {
    private int intervaloDias;

    public TarefaRecorrente(String descricao, int intervaloDias){
        super(descricao);
        this.intervaloDias = intervaloDias;
    }

    @Override
    public void executarTarefa() {
        System.out.println("TAREFA RECORRENTE\n--------------------");
        System.out.println("Executando tarefa recorrente: " + descricao + " a cada " + intervaloDias + " dias.");
    }
}
