package Exercicios;

public class Ex1_Main {
    public static void main(String[] args) {
        Ex1_Recurso recurso = new Ex1_Recurso(30);

        Runnable tarefa = new Ex1_MinhaTarefa(recurso, 5);

        Thread t1 = new Thread(tarefa, "Thread 1");
        Thread t2 = new Thread(tarefa, "Thread 2");

        t1.start();
        t2.start();
    }
}
