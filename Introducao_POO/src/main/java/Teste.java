

public class Teste {

    public static void main(String[] args) {

        // Instâmciando um objeto = criar um objeto
        // Usamos o new para criar o objeto

        BilheteUnico bilhete01 = new BilheteUnico();

        bilhete01.nomeTitular = "Giuliana";
        bilhete01.saldo = 0.0;
        bilhete01.codigo = "B001";

        bilhete01.carregar(42.0);

        System.out.println("Saldo Atual: " + bilhete01.saldo);

        BilheteUnico bilhete02 = new BilheteUnico();

        bilhete02.nomeTitular = "Bob da Silva";
        bilhete02.saldo = 0.0;
        bilhete02.codigo = "B002";




    }

}
