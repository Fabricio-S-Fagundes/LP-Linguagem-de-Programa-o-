import java.util.concurrent.ThreadLocalRandom;

public class NivelamentoRandomicos {

    public static void main(String[] args) {

        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(-5,10);

        System.out.println(numeroAleatorio);

        Double numeroAleatorioReal = ThreadLocalRandom.current().nextDouble(6.89);

        System.out.println(numeroAleatorioReal);
    }
}
