public class TarefaComPrazo extends Tarefa {
    private String prazo;

    public TarefaComPrazo(String descricao, String prazo){
        super(descricao); // inicializa corretamente o atributo 'descricao' que está na classe superclasse
        this.prazo = prazo;
    }

    @Override
    public void executarTarefa() {
        System.out.println("TAREFA COM PRAZO\n--------------------");
        System.out.println("Executando tarefa com prazo: " + descricao + " | Prazo: " + prazo);
    }
}