package Exercicios;

public class Ex3_Main {
    public static void main(String[] args) {
        Ex3_MinhaThread t1 = new Ex3_MinhaThread("Thread 1");
        Ex3_MinhaThread t2 = new Ex3_MinhaThread("Thread 2");

        t1.start();
        t2.start();
    }
}
