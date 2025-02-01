package school.sptech;

public abstract class Figura {

    private String cor;
    private String espessura;

    public Figura() {
    }

    public Figura(String cor, String espessura) {
        this.cor = cor;
        this.espessura = espessura;
    }

    public abstract Double calcularArea();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEspessura() {
        return espessura;
    }

    public void setEspessura(String espessura) {
        this.espessura = espessura;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "cor='" + cor + '\'' +
                ", espessura='" + espessura + '\'' +
                '}';
    }
}
