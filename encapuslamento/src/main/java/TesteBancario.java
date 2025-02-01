public class TesteBancario {
    public static void main(String[] args) {
        ContaBancaria conta01 = new ContaBancaria("Bob", 0.0  , "C001", 01);


        ContaBancaria conta02 = new ContaBancaria();

        conta01.sacar(10.5);
        //  System.out.println("Saldo conta 1: " + conta01.saldo);
    }
}
