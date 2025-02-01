import java.util.Scanner;

public class ExemploScanner {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // entrada com um numero inteiro e saida apresentando o nuemro guardado

//        System.out.println("Digite um numero inteiro:");
//        Integer numeroDigitado = leitor.nextInt();
//
//        System.out.println(
//                String.format(10"O número digitado foi %d" , numeroDigitado)
//        );



        // entrada com um numero decimal e saida apresentando o nuemro guardado

//        System.out.println("Digite um numero real:");
//
//        Double numeroDecimalDigitado = leitor.nextDouble();
//
//        System.out.println(
//                String.format("O numero decimal digitado foi: %.2f", numeroDecimalDigitado)
//        );

        // entrada com texto(String) e aprensentando o mesmo recebido

//        System.out.println("Digite um nome:");
//
//        String nomeDigitado = leitor.nextLine();
//
//        System.out.println(
//                String.format("o nome digitado foi: %s", nomeDigitado)
//        );

        System.out.println(
                """
                Tabuada do 1 a 10
                Digite um numero:
                """);

        Integer numeroTabuadaDigitado = leitor.nextInt();

        for (Integer i = 1; i <= 10; i++){

            Integer resultMultiplicacao = numeroTabuadaDigitado * i;

            System.out.printf("%d X %d = %d\n", numeroTabuadaDigitado, i, resultMultiplicacao);

        }

    }
}
