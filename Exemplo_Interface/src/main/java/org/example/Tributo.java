package org.example;

import  java.util.List;

public class Tributo {

    private List<Tributavel> tributaveis;

    public Tributo(List<Tributavel> tributaveis) {
        this.tributaveis = tributaveis;
    }

    public void adicionarTrinutavel(Tributavel t){
        this.tributaveis.add(t);
    }

    public Double calcularTotalTributo(){
        for(Tributavel tributavel : this.tributaveis){

        }
    }
}
