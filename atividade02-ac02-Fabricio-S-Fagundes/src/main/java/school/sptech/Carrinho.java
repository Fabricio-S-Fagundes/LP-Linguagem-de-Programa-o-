package school.sptech;

import javax.sound.sampled.Port;
import java.util.List;

public class Carrinho {

    private String cliente;

    private List<Produto> produtos;

    public Carrinho() {

    }

    public Integer getQuantidade(){
        Integer qtdProdutos = produtos.size();

        return  qtdProdutos;
    }

    public void adicionar(Produto produto){
        produtos.add(produto);
    }

    public Boolean existsPorNome(String nome){
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) return true;
        }
        return false;
    }

    public Integer getQuantidadePorCategoria(String nome){
        Integer qtdCategoria = 0;

        for (Produto produto : produtos) {
            if (produto.getCategoria().equalsIgnoreCase(nome))  qtdCategoria++;
        }

        return qtdCategoria;
    }

    public void limpar(){
        produtos.clear();
    }

    public void removerPorNome(String nome){
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equalsIgnoreCase(nome)) produtos.remove(i);

        }
    }

    public Boolean temDuplicidade(String nome){

        Integer qtdProduto = 0;

        for (int i = 0; i < produtos.size(); i++) {

            if (produtos.get(i).getNome().equalsIgnoreCase(nome)){

                qtdProduto ++;

            }
        }
        return qtdProduto >= 2 ? true : false;
    }

    public Produto getPorNome(String p){
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(p)) return produto;
        }
        return null;
    }

    public Double getValorTotal(){

        Double valorTotal = 0.0;

        for (Produto produto : produtos) {
            valorTotal += produto.getPreco();
        }
        return valorTotal;
    }
}
