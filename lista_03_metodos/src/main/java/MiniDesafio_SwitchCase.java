import  java.util.Scanner;

public class MiniDesafio_SwitchCase {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("""
                Digite uma das operações
                1 - Somar
                2 - Subtrair
                3 - Mulplicar
                """);

        Integer numeroDigitado;
        Integer numero01;
        Integer numero02;

        do{

            numeroDigitado = leitor.nextInt();

            if (numeroDigitado != 1 && numeroDigitado != 2 && numeroDigitado != 3) {
            System.out.println("Número inválido, Digite novamente!!");
            }


        }while (numeroDigitado != 1 && numeroDigitado != 2 && numeroDigitado != 3);

        switch (numeroDigitado){

            case 1:
            System.out.println("Digite o primeiro número inteiro\n");

            numero01 = leitor.nextInt();

            System.out.println("Digite o segundo número inteiro\n");

            numero02 = leitor.nextInt();

            System.out.printf("Resultado é: %d", (numero01 + numero02));
            break;

            case 2:

            System.out.println("Digite o primeiro número inteiro\n");

            numero01 = leitor.nextInt();

            System.out.println("Digite o segundo número inteiro\n");

            numero02 = leitor.nextInt();

            System.out.printf("Resultado é: %d", (numero01 - numero02));
            break;

            case 3:

            System.out.println("Digite o primeiro número inteiro\n");

            numero01 = leitor.nextInt();

            System.out.println("Digite o segundo número inteiro\n");

            numero02 = leitor.nextInt();

            System.out.printf("Resultado é: %d", (numero01 * numero02));

        }
    }
}
