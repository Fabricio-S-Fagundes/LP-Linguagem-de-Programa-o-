public class Pet {

    private  String nome;

    private Integer qtdBanhosTomados = 0;

    private Double valorGastoEmPetShop = 0.0;

    public Pet(String nome) {
        this.nome = nome;
        this.qtdBanhosTomados = 0;
        this.valorGastoEmPetShop = 0.0;
    }

    public String toString(){
        return String.format("""
                
                Nome: %s
                Banhos Tomados: %d
                Valor gasto em pet shops %.2f
                
                """, this.getNome(), this.getQtdBanhosTomados(), this.getValorGastoEmPetShop());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdBanhosTomados() {
        return qtdBanhosTomados;
    }

    public void setQtdBanhosTomados(Integer qtdBanhosTomados) {
        this.qtdBanhosTomados = qtdBanhosTomados;
    }

    public Double getValorGastoEmPetShop() {
        return valorGastoEmPetShop;
    }

    public void setValorGastoEmPetShop(Double valorGastoEmPetShop) {
        this.valorGastoEmPetShop = valorGastoEmPetShop;
    }
}
