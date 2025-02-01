package org.example;

public class testeVenda {

    public static void main(String[] args) {

        Loja lojinha1 = new Loja("Lojinha do zé", 10);

        lojinha1.realizarVenda(25.0);
        lojinha1.realizarVenda(51.0);
        lojinha1.realizarVenda(5.0);
        lojinha1.realizarVenda(34.0);
        lojinha1.realizarVenda(23.0);
        lojinha1.realizarVenda(27.0);

        System.out.println(lojinha1);

    }

}
