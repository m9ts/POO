package Exercicios;

import java.util.Random;

public class Ex4_Corredor implements Runnable {
    private String nome;
    private int distanciaTotal = 30;
    private int posicaoAtual = 0;
    Random random;

    public Ex4_Corredor(String nome) {
        this.nome = nome;
        this.posicaoAtual = 0;
        this.random = new Random();
    }

    @Override
    public void run() {
        while(posicaoAtual < distanciaTotal) {
            int passo = random.nextInt(10) + 1;
            posicaoAtual += passo;
            System.out.println(nome + " avançou " + passo + " metros | Total: " + posicaoAtual + " metros");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        if (posicaoAtual >= distanciaTotal) {
            System.out.println(nome + " concluiu a corrida!");
        }
    } 
}
