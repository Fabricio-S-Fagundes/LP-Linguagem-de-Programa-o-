package school.sptech.ex1;

public class Bolo {

    String sabor;

    Double valor;

    Integer quantidadeVendida;

    Integer quantidadeEmEstoque;


    void venderBolo(Integer qtdDesejada){

        if(qtdDesejada <= 0 || qtdDesejada > quantidadeEmEstoque){

        } else {
            quantidadeVendida += qtdDesejada;
            System.out.println("Vendeu: " + qtdDesejada);
            System.out.println("Vendas Totais: " + quantidadeVendida);
        }

    }

    void aumentarEstoque(Integer qtdRecebida){
        if(qtdRecebida <= 0){

        } else {
            quantidadeEmEstoque += qtdRecebida;
            System.out.println("Recebeu " + qtdRecebida + " de Bolos de " + sabor);
        }
    }

    Integer estoqueAtual(){
        return quantidadeEmEstoque;
    }

    Double totalVendido(){
        return valor * quantidadeVendida;
    }
}
