package school.sptech;

public class Circulo extends Figura {

    private Double raio;

    public Circulo() {
    }

    public Circulo(String cor, String espessura, Double raio) {
        super(cor, espessura);
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return (raio * raio) * Math.PI;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                "} " + super.toString();
    }
}
