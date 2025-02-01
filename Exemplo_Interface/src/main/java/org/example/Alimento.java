package org.example;

public class Alimento extends Produto{

    private Integer qtdVitamina;

    public Alimento(Integer codigo, String descricao, Double preco, Integer qtdVitamina) {
        super(codigo, descricao, preco);
        this.qtdVitamina = qtdVitamina;
    }

    public Alimento(Integer qtdVitamina) {
        this.qtdVitamina = qtdVitamina;
    }

    @Override
    public Double getValorTributo() {
        return null;
    }
}
