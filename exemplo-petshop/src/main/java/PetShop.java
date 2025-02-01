public class PetShop {

    private  String nome;

    private  Integer qtdBanhosRealizados;

    private  Double valorBanho;

    private Double valorTotalGanho;

    public PetShop(String nome, Double valorBanho) {
        this.nome = nome;
        this.valorBanho = valorBanho;
        this.qtdBanhosRealizados = 0;
        this.valorTotalGanho = 0.0;
    }

    public void darBanho(Pet pet){
        System.out.println("Dando banho no pet " + pet.getNome());

        pet.setQtdBanhosTomados(pet.getQtdBanhosTomados() + 1);

        pet.setValorGastoEmPetShop(pet.getValorGastoEmPetShop() + this.valorBanho);

        this.qtdBanhosRealizados ++;

    }

    



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdBanhosRealizados() {
        return qtdBanhosRealizados;
    }

    public void setQtdBanhosRealizados(Integer qtdBanhosRealizados) {
        this.qtdBanhosRealizados = qtdBanhosRealizados;
    }

    public Double getValorBanho() {
        return valorBanho;
    }

    public void setValorBanho(Double valorBanho) {
        this.valorBanho = valorBanho;
    }

    public Double getValorTotalGanho() {
        return valorTotalGanho;
    }

    public void setValorTotalGanho(Double valorTotalGanho) {
        this.valorTotalGanho = valorTotalGanho;
    }
}
