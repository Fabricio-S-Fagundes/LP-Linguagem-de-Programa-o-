import org.example.Veiculo;

public class Bicicleta extends Veiculo {

    private Double nivelCalibragemPneu;
    private Double pesoMaximo;

    public Bicicleta(Double nivelCalibragemPneu, Double pesoMaximo) {
        this.nivelCalibragemPneu = nivelCalibragemPneu;
        this.pesoMaximo = pesoMaximo;
    }

    @Override
    public void exibirRelatorioDeRevisao() {

    }

    public Double getNivelCalibragemPneu() {
        return nivelCalibragemPneu;
    }

    public void setNivelCalibragemPneu(Double nivelCalibragemPneu) {
        this.nivelCalibragemPneu = nivelCalibragemPneu;
    }

    public Double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(Double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }
}
