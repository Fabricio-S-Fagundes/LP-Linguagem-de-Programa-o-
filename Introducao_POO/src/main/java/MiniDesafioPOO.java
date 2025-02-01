import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MiniDesafioPOO {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Scanner leitorCofre = new Scanner(System.in);

        Cofre cofrinho01 = new Cofre();
        Cofre cofrinho02 = new Cofre();

        cofrinho01.estaQuebrado = false;
        cofrinho02.estaQuebrado = false;

        Integer escolha = 1;



  }
}
//    do {
//
//        System.out.println("""
//                O que você deseja fazer:
//
//                1 - Verificar Cofre
//                2 - Depositar
//                3 - Agitar
//
//                """);
//        escolha = leitor.nextInt();
//
//            if (escolha == 1){
//
//
//            } else if (escolha == 2) {
//
//            System.out.println("Digite o Valor a ser depositado");
//
//            Double valorDepositar;
//
//
//            } else {
//
//            }
//
//        } while (escolha == 1 || escolha == 2 || escolha == 3);
