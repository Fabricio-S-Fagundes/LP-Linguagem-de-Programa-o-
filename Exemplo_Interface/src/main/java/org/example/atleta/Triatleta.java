package org.example.atleta;

public class Triatleta implements Corredor, Nadador {

    private String nome;

    public Triatleta(String nome) {
        this.nome = nome;
    }

    @Override
    public void correr() {
        System.out.println("Correndo maratona");
    }

    @Override
    public void nadar() {
        System.out.println("Nadando maratona");
    }
}
