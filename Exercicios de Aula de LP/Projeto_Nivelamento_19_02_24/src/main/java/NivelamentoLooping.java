import java.util.concurrent.ThreadLocalRandom;

public class NivelamentoLooping {

    public static void main(String[] args) {

//        // for de 0 a 10
//        for(int i = 0; i <= 10; i++){
//
//            System.out.println(i);
//        }
//
//        // for do 10 a 0
//        System.out.println("for do 10 a 0");
//
//        for(int i = 10; i >= 0; i --){
//
//            System.out.println(i);
//        }

//        int i = 0;
//
//        while (i <= 10){
//            System.out.println(i);
//            i ++;
//        }

        for (int i = 0; i != 3;){
            i = ThreadLocalRandom.current().nextInt(0,3);
            System.out.println("Você ganhou");
        }

        Integer outroAleatorio;

        do {
            outroAleatorio = ThreadLocalRandom.current().nextInt(0, 10);

            System.out.println(outroAleatorio );

        } while( outroAleatorio != 3);{
            System.out.println("Vc perdeu");
        }

    }
}
