package school.sptech;

import java.util.List;

public class Carrinho implements Vendavel {

    List<Vendavel> vendaveis;

    public void adicionarVendavel(Vendavel v){
        this.vendaveis.add(v);
    }

    public Double calcucularTotalVenda(){

        Double valorTotal = 0.0;

        for(Vendavel vendavel : vendaveis) {

            valorTotal += vendavel.getValorVenda();

        }
        return valorTotal;
    }

    public void exibeItensCarrinho(){

        for(Vendavel vendavel : vendaveis){

            System.out.println(vendavel.toString());

        }

    }

    @Override
    public Double getValorVenda() {
        return null;
    }
}
