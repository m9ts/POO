public class Main {
    public static void main(String[] args) {
        TarefaSimples tarefaSimples = new TarefaSimples("Arrumar a cama.");
        TarefaComPrazo tarefaComPrazo = new TarefaComPrazo("Realizar exame de sangue", "26/10/2025");
        TarefaRecorrente tarefaRecorrente = new TarefaRecorrente("Viajar para a praia", 30);

        
        tarefaSimples.executarTarefa();
        tarefaSimples.resumo();

        tarefaComPrazo.executarTarefa();
        tarefaComPrazo.resumo();

        tarefaRecorrente.executarTarefa();
        tarefaRecorrente.resumo();
    }
}
