package school.sptech;

public class PetShop {

  private String nome;
  private Integer qtdBanhosRealizados;
  private Double valorBanho;
  private Double valorTotalGanho;

  public PetShop(String nome, Double valorBanho) {
    this.nome = nome;
    this.valorBanho = valorBanho;
    this.qtdBanhosRealizados = 0;
    this.valorTotalGanho = 0.0;
  }

  public void darBanho(Pet pet) {
    System.out.println("Dando banho no pet " + pet.getNome());
    pet.setQtdBanhosTomados(pet.getQtdBanhosTomados() + 1);
    pet.setValorGastoEmPetShops(pet.getValorGastoEmPetShops() + this.valorBanho);
    this.qtdBanhosRealizados++;
    this.valorTotalGanho += this.valorBanho;
  }

  public void darBanho(Pet pet, Double desconto) {
    System.out.println("Dando banho no pet " + pet.getNome());
    pet.setQtdBanhosTomados(pet.getQtdBanhosTomados() + 1);

    Double valorComDesconto = this.valorBanho - (this.valorBanho * desconto);

    pet.setValorGastoEmPetShops(pet.getValorGastoEmPetShops() + valorComDesconto);
    this.qtdBanhosRealizados++;
    this.valorTotalGanho += valorComDesconto;
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

  @Override
  public String toString() {
    return "PetShop{" +
           "nome='" + nome + '\'' +
           ", qtdBanhosRealizados=" + qtdBanhosRealizados +
           ", valorBanho=" + valorBanho +
           ", valorTotalGanho=" + valorTotalGanho +
           '}';
  }
}
