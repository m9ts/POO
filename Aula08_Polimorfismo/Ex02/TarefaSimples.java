public class TarefaSimples extends Tarefa {

    public TarefaSimples(String descricao){
        super(descricao);
    }

    @Override
    public void executarTarefa() {
        System.out.println("TAREFA SIMPLES\n--------------------");
        System.out.println("Executando tarefa simples: " + descricao);
    }
}
