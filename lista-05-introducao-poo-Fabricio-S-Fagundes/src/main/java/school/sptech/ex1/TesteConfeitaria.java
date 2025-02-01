package school.sptech.ex1;

public class TesteConfeitaria {

  public static void main(String[] args) {

    Bolo bolos01 = new Bolo();
    bolos01.sabor = "Chocolate Ao leite";
    bolos01.valor = 30.99;
    bolos01.quantidadeVendida = 8;
    bolos01.quantidadeEmEstoque = 10;

    Bolo bolos02 = new Bolo();
    bolos02.sabor = "Morango com Chcolate Branco";
    bolos02.valor = 38.99;
    bolos02.quantidadeVendida = 12;
    bolos02.quantidadeEmEstoque = 20;

    Integer bolo01QTDdesejada = 3;

    Integer bolo02QTDdesejada = 7;


    Integer bolo01QTDrecebida = 11;

    Integer bolo02QTDrecebida = 8;


    bolos01.venderBolo(bolo01QTDdesejada);
    bolos02.venderBolo(bolo02QTDdesejada);

    bolos01.aumentarEstoque(bolo01QTDrecebida);
    bolos02.aumentarEstoque(bolo02QTDrecebida);







  }
}
