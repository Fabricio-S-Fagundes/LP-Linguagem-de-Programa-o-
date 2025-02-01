import java.util.ArrayList;
import java.util.List;

public class TesteBanco {
    public static void main(String[] args) {
        ContaBancaria conta01 = new ContaBancaria(
                "Bob",
                "C001",
                100);
        ContaBancaria conta02 = new ContaBancaria();

        conta01.sacar(10.5);
        System.out.println("Saldo conta 1: " + conta01.getSaldo());
    }
}
