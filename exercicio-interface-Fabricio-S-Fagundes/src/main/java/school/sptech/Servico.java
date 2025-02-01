package school.sptech;

public class Servico implements Vendavel{

    private  String descricao;

    private Integer codigo;

    private Integer quatHoras;

    private Double valorHora;

    @Override
    public Double getValorVenda() {
        return quatHoras * valorHora;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "Descricao ='" + descricao + '\'' +
                ", Dodigo =" + codigo +
                ", QTD de Horas =" + quatHoras +
                ", Valor da Hora =" + valorHora +
                '}';
    }
}
