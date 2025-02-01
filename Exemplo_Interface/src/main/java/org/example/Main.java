package org.example;

import org.example.atleta.Carteiro;
import org.example.atleta.Corredor;
import org.example.atleta.Triatleta;
import org.example.atleta.Velocista;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Corredor corredr1 = new Velocista("Bolt");
        corredr1.correr();

        Carteiro carteiro1 = new Carteiro("Jaime");
        carteiro1.correr();

        Triatleta triatleta1 = new Triatleta("Maicon");
        triatleta1.correr();
        triatleta1.nadar();

        List<Corredor> corredores = new ArrayList<>();

        corredores.add(triatleta1);
        corredores.add(carteiro1);
        corredores.add();


    }
}