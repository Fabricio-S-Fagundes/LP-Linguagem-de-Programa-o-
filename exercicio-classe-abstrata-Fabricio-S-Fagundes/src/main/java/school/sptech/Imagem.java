package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {


    private List<Figura> figuras;

    public void adicionar(Figura figura){

        figuras.add(figura);

    }

    public Double calcularSomaDasAreas(){
        Double somaAreas = 0.0;

        for (Figura figura : figuras){

            if (figura instanceof Quadrado){
                ((Quadrado)figura).calcularArea();

                somaAreas += figura.calcularArea();
            }else if (figura instanceof Retangulo){
                ((Retangulo)figura).calcularArea();

                somaAreas += figura.calcularArea();
            }else if (figura instanceof Triangulo){
                ((Triangulo)figura).calcularArea();

                somaAreas += figura.calcularArea();
            } else {
                ((Circulo)figura).calcularArea();

                somaAreas += figura.calcularArea();
            }

        }

        return somaAreas;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){


    }

    public List<Figura> buscarQuadrados(){

    }


}
