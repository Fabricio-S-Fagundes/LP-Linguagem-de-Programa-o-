package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Carta c1 = new Carta(Simbolo.REI, Naipe.ESPADAS);
        Carta c2 = new Carta(Simbolo.DOIS, Naipe.COPAS);
        Carta c3 = new Carta(Simbolo.AS, Naipe.OUROS);

        switch (c1.getNaipe()){
            case COPAS:
                System.out.println("Copas");
                break;
            case PAUS:
                System.out.println("Paus");
                break;
            case OUROS:
                System.out.println("Ouros");
                break;
            case ESPADAS:
                System.out.println("Espadas");
                break;
        }

        Scanner leitor = new Scanner(System.in);

        String naipe = leitor.next();
        Simbolo simbolo = leitor.next();

        Carta c4 = new Carta(Simbolo.valueOf(simbolo),
                                Naipe.valueOf(naipe));

        System.out.println(c4);

        Simbolo simbolodigitado = null;

        for(Simbolo s : Simbolo.values()){
            if(s.getFigura().equals(simbolo)){
                simbolodigitado = simbolo;
            }
        }
    }
}