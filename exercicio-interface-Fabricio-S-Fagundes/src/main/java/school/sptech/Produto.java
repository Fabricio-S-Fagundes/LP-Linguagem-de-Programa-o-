package school.sptech;

public abstract class Produto implements Vendavel {

    private Integer codigo;

    private Double precoDouble;

    public Produto(Integer codigo, Double precoDouble) {
        this.codigo = codigo;
        this.precoDouble = precoDouble;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "Codigo =" + codigo +
                ", Preço =" + precoDouble +
                '}';
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getPrecoDouble() {
        return precoDouble;
    }

    public void setPrecoDouble(Double precoDouble) {
        this.precoDouble = precoDouble;
    }
}
