import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ExemplosMetodos {

    public static void main(String[] args) {
        Utilitaria utilitaria = new Utilitaria();

        List<String> frutas = new ArrayList<>();

        frutas.add("Laranja");
        frutas.add("Carambola");
        frutas.add("Goiaba");
        frutas.add("Kiwi");


        System.out.println("Frutas:");

        utilitaria.exibirLista(frutas);

        String frutaPesquisa = "Laranja";

        Boolean existeFruta = utilitaria.existeNaLista(frutas, frutaPesquisa);

        utilitaria.exibirMensagemDaLista(existeFruta, frutaPesquisa);





        List<String> nomes = new ArrayList<>();

        nomes.add("Rogério");
        nomes.add("Natália");
        nomes.add("Maria");
        nomes.add("Anderson");
        nomes.add("Pedro");


        System.out.println("Nomes:");


        utilitaria.exibirLista(nomes);

        System.out.println();

        String nomePesquisa = "Pedro";

        Boolean existeNome = utilitaria.existeNaLista(nomes, nomePesquisa);

        utilitaria.exibirMensagemDaLista(existeNome, nomePesquisa);

//        utilitaria.somar(5, 7);
//
//        Integer resultado = utilitaria.somar(7, 9);
//        Integer resultado2 = utilitaria.somar(resultado, 4);
//
//        System.out.println(resultado);
//        System.out.println(resultado2);

    }
}
