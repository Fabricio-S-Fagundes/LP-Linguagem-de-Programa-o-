import  java.util.Scanner;
public class DesafioScanner {

    public static void main(String[] args) {

        Scanner cadastrarInformações = new Scanner(System.in);

        System.out.println(
                """
                Cadastramento de Pets
                Por favor, insira informações do seu pet:\n
                """);

        System.out.println("Nome do pet:");
        String nomePet = cadastrarInformações.nextLine();

        System.out.println("\nAltura do pet:");
        Double alturaPet = cadastrarInformações.nextDouble();

        System.out.println("\nIdadde do pet:");
        Integer idadePet = cadastrarInformações.nextInt();

        System.out.printf(
                """
                
                De acordo com as informações....
                O nome do seu pet é %s
                A altura dele é %.2f
                E tem %d anos.
                
                """, nomePet, alturaPet, idadePet);

    }
}
