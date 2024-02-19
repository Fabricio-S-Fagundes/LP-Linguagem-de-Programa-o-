public class OperadoresMatemáticos {

    public static void main(String[] args) {
        // JS
        /* +, -, /, *, %
         * +=, -=, ++, --
         * Java é igual
         */

        Double numero01 = 42.0;
        Double numero02 = 2.0;

        System.out.println("Soma: " + (numero01 + numero02));
        System.out.println("Multiplicação: " + (numero01 * numero02));
        System.out.println("Subtração: " + (numero01 - numero02));
        System.out.println("Divisão: " + (numero01 / numero02));
        System.out.println("Resto: " + (numero01 % numero02));

        Double resultadoPotencia = Math.pow(numero01, numero02);
        System.out.println("Potenciação: " + resultadoPotencia);

        /* Sem usar variavél auxiliar
         * System.out.println("Potenciação: " + Math.pow(numero01, numero02));
         */
    }
}

