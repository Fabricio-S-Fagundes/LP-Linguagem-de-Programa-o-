import java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;


public class DesafioDaAula_26_02_24 {

    public static void main(String[] args) {

        List<Integer> listaDeNumeros = new ArrayList();

        Scanner leitorQtdDeNumeros = new Scanner(System.in);
        Scanner leitorDosNumeros = new Scanner(System.in);

        System.out.println("Digite a qunatidade de numero que terá:");

        Integer entradaDosInteiros = leitorQtdDeNumeros.nextInt();

        for (int i = 0; i < entradaDosInteiros; i ++){

            System.out.printf("Digite o %dº número:", i + 1);

            Integer numeroDigitado = leitorDosNumeros.nextInt();

            listaDeNumeros.add(numeroDigitado);
        }

        System.out.println("Sua Lista é:\n " + listaDeNumeros);

        System.out.println("Agora removendo os pares..");

        for (int contador = 0; contador < listaDeNumeros.size(); contador++){

            if (listaDeNumeros.get(contador) % 2 == 0){
                listaDeNumeros.remove(contador);

                contador --;
            }

        }

        System.out.println("Prontinho, sua nova lista é essa:\n" + listaDeNumeros);



    }
    public static void Usuario(){

    }
}
