public class TarefaComPrazo extends Tarefa {
    private String prazo;

    public TarefaComPrazo(String descricao, String prazo){
        super(descricao);
        this.prazo = prazo;
    }

    @Override
    public void executarTarefa() {
        System.out.println("TAREFA COM PRAZO\n--------------------");
        System.out.println("Executando tarefa com prazo: " + descricao + " | Prazo: " + prazo);
    }
}