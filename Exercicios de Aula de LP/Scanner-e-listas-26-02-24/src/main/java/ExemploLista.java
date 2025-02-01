import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ExemploLista {

    public static void main(String[] args) {

//        List listaMaluca = new ArrayList();
//
//        listaMaluca.add("Fabricio");
//        listaMaluca.add(8);
//        listaMaluca.add(true);
//        listaMaluca.add(1.75);
//
//        listaMaluca.add(0,"Diego");
//
//        listaMaluca.set(1,"FELADAPUTA");
//
//        //listaMaluca.remove(index) boolean vai pela posição do dado dentro de uma lista
//        // exemplo listaMaluca.remove(8), ira remover o valor na posição 8
//
//        //listaMaluca.remove(object) remove apartir de um objeto ja existente.
//        // Integer valor = 8;
//        //listamaluca.remove(valor) ele irá removar o valor da lista que coiencide com o mesmo objeto
//
//        System.out.println(listaMaluca.get(0));
//
//
//        // System.out.println(listaMaluca);


    List<Integer> listaNumeros = new ArrayList();

//    listaNumeros.add(9);
//    listaNumeros.add(10);
//    listaNumeros.add(50);
//    listaNumeros.add(50);
//    listaNumeros.add(190);
//
//
//    for (Integer i = 0; i < listaNumeros.size(); i++){
//
//        System.out.println(listaNumeros.get(i));
//
//    }

    //listaNumeros.remove(4); index

    //Integer numero = 50;  Object
    //listaNumeros.remove(numero);

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos valores deseja digitar?");

        Integer qtdvalores = leitor.nextInt();

        for (int i =0; i < qtdvalores; i++){

            System.out.println(
                    String.format("Informe o %d valor:", i + 1)
            );

            Integer valorDigitado = leitor.nextInt();
            listaNumeros.add(valorDigitado);

        }

        System.out.println(listaNumeros);

    }
}
