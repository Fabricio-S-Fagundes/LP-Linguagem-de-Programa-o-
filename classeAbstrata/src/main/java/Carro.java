import org.example.Veiculo;

public class Carro extends Veiculo {

    private Double nivelOleo;
    private Boolean possuiStep;

    public Carro(String proprietario, String fabricante, Double valor, Integer anoFabricacao, Double nivelOleo, Boolean possuiStep) {
        super(proprietario, fabricante, valor, anoFabricacao);
        this.nivelOleo = nivelOleo;
        this.possuiStep = possuiStep;
    }

    public void exibirRelatorioDeRevisao(){

        if (nivelOleo < 0.5){
            System.out.println("Precisa trocar o óleo");
        } else {
            System.out.println("Nível de óleo okay");
        }

        if (possuiStep){
            System.out.println("Step ok");
        } else {
            System.out.println("Compre um Step");
        }

    }

    public Double getNivelOleo() {
        return nivelOleo;
    }

    public void setNivelOleo(Double nivelOleo) {
        this.nivelOleo = nivelOleo;
    }

    public Boolean getPossuiStep() {
        return possuiStep;
    }

    public void setPossuiStep(Boolean possuiStep) {
        this.possuiStep = possuiStep;
    }
}
