package org.example;

import org.example.Produto;

public class Perfume extends Produto {

    private  String fragancia;

    public Perfume(Integer codigo, String descricao, Double preco, String fragancia) {
        super(codigo, descricao, preco);
        this.fragancia = fragancia;
    }

    public Perfume(String fragancia) {
        this.fragancia = fragancia;
    }

    @Override
    public Double getValorTributo() {
        return this.getPreco()*;
    }
}
