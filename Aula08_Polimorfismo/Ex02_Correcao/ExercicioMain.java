package Ex02_Correcao;

import java.util.ArrayList;
import java.util.List;

public class ExercicioMain {
    public static void main(String[] args) {
        List<Tarefa> tarefaList = new ArrayList<>();

        // Upcasting
        tarefaList.add(new TarefaSimples("Passear com o cachorro"));
        tarefaList.add(new TarefaComPrazo("Realizar prova II de Java", "06/11/2025"));
        tarefaList.add(new TarefaRecorrente("Estudar", 7));

        for (Tarefa tarefa : tarefaList) {
            System.out.println(tarefa.resumo());

            // Downcasting
            if (tarefa instanceof TarefaComPrazo) {
                System.out.println(((TarefaComPrazo) tarefa).getPrazo());
            }

            if (tarefa instanceof Executavel) {
                ((Executavel) tarefa).executarTarefa();
            }
        }

        List<Executavel> executavelList = new ArrayList<>();
        executavelList.add(new TarefaSimples("Passear com o cachorro"));
        executavelList.add(new TarefaComPrazo("Realizar a prova II de Java", "06/11/2025"));
        executavelList.add(new TarefaRecorrente("Estudar", 7));

        for (Executavel executavel : executavelList) {
            executavel.executarTarefa();
        }
    }
}
