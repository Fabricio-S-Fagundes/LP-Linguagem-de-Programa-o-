package org.example;

public class test {
    public static void main(String[] args) {
        Contato contato01 = new Contato("Giu", "(11) 123");
        Contato contato02 = new Contato("Bob", "(11) 321");
        Contato contato03 = new Contato("Ana", "(11) 456");

        Grupo  grupo01 = new Grupo("Trabalho");
        Grupo  grupo02 = new Grupo("Amigos");

        grupo01.adicionar(contato01);
        grupo01.adicionar(contato02);

        grupo02.adicionar(contato03);
//
//        System.out.println(grupo01);
//        System.out.println(grupo02);
//
//        grupo01.remover(contato01);
//
//        System.out.println(grupo01);

        System.out.println(grupo01.buscarPeloNome("Giu"));

    }
}
