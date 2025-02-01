import org.example.Main;

public class Exemplo_Interpolacao {

    public static void main(String[] args) {

        String nome = "Fabio";
        Integer idade = 42;
        Double altura = 1.89;

        // na interpolação utilizamos:
        //para string %s
        //para inteiros %d
        //para double %.2f (Sendo 2 a qunatidade de casa deciamais depois do ponto)


        Boolean petVacinado = false;

        // String frasePetVacinado = petVacinado ? "Sim" : "Não";

        // Metodos de Interpolações

//        String frasePetVacinado;
//        if(petVacinado){
//            frasePetVacinado = "SIM";
//        } else {
//            frasePetVacinado = "NÂO";
//        }


//        String fraseFormada = String.format(
//                """
//                Meu nome é: %s
//                Minha idade é: %d
//                Minha altura é: %.2f
//                """, nome, idade, altura);

//        String fraseFormatadaSegundaAlternativa =
//                """
//                Meu nome é: %s
//                Minha idade é: %d
//                Minha altura é: %.2f
//                Pet Vaciando: %s
//                """.formatted(nome, idade, altura, frasePetVacinado);

        String fraseFormatadaSegundaAlternativa =
                """
                Meu nome é: %s
                Minha idade é: %d
                Minha altura é: %.2f
                Pet Vaciando: %s
                """.formatted(nome, idade, altura, (petVacinado ? "Sim" : "Não"));


        // Se a idade for menor que 15, o salário será de 1000
        // Se for maior ou igual a 15, o salário será de 1412

        Integer idadeParaPagamento = 15;
        Double valorSalario = idadeParaPagamento >= 15 ? 1412.0 : 1000.0;
        Boolean isMaiorDeIdade = idadeParaPagamento >= 18;


        System.out.println(
        fraseFormatadaSegundaAlternativa
        );






    }
}
