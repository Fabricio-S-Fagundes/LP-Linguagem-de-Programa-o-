package org.example;

public class Loja {

    private String nomeLoja;

    private Integer qtdVendas;

    private Integer qtdMetaVendas;

    private Double valorTotalVendas;

    public Loja(String nomeLoja, Integer qtdMetaVendas) {
        this.nomeLoja = nomeLoja;
        this.qtdVendas = 0;
        this.qtdMetaVendas = qtdMetaVendas;
        this.valorTotalVendas = 0.0;
    }



    void realizarVenda(Double valorVenda){

        valorTotalVendas += valorVenda;
        qtdVendas++;

    }

    void realizarVenda(Double valorVenda, Double valorDesconto){

        valorTotalVendas += valorVenda - (valorVenda * valorDesconto);
        qtdVendas++;
    }

    Boolean verificarMeta(){
            return this.qtdVendas >= this.qtdMetaVendas;
    }

    public String toString() {
        return "Loja{" +
                "nomeLoja='" + nomeLoja + '\'' +
                ", qtdVendas=" + qtdVendas +
                ", qtdMetaVendas=" + qtdMetaVendas +
                ", valorTotalVendas=" + valorTotalVendas +
                ", Bateu a Meta? " + verificarMeta() +
                '}';
    }
}
