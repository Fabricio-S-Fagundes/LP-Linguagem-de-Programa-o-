import java.util.Scanner;

public class ExemploSwitchCase {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número do dia da senama");

        Integer diaDaSemana = leitor.nextInt();


        switch (diaDaSemana){

            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");

            default:
                System.out.println("Número inválido");
        }


        String fruta = "Melancia";

        switch (fruta){
            case "Maça":
                System.out.println("Temos Maça no estoque");
            case "Melancia":
                System.out.println("Temos Melancia no estoque");
            case "Kiwi":
                System.out.println("Não é época de Kiwi, não temos no estoque");
            default:
                System.out.println("Não identifiquei a fruta digitada");
        }


//        String nome01 = "Bob";
//        String nome02 = leitor.nextLine();
//
//        if(nome01.equals(nome02)){
//            System.out.println("É igual");
//        }
//        else {
//            System.out.println("Não e igual");
//        }

    }

}
