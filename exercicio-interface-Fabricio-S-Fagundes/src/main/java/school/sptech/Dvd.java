package school.sptech;

public class Dvd extends Produto {

    private String nome;

    private String gravadora;

    public Dvd(Integer codigo, Double precoDouble) {
        super(codigo, precoDouble);
    }

    @Override
    public Double getValorVenda() {
        return getPrecoDouble() * 0.20;
    }

    @Override
    public String toString() {
        return "Dvd {" +
                "Nome ='" + nome + '\'' +
                ", Gravadora ='" + gravadora + '\'' +
                "} " + super.toString();
    }
}
