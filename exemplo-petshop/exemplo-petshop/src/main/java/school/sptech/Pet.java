package school.sptech;

public class Pet {

  private String nome;
  private Integer qtdBanhosTomados;
  private Double valorGastoEmPetShops;

  public Pet(String nome) {
    this.nome = nome;
    this.qtdBanhosTomados = 0;
    this.valorGastoEmPetShops = 0.0;
  }

  public void exibirValores() {
    System.out.println();
  }

//  public String toString() {
//    return String.format(
//        """
//        Nome: %s
//        Banhos tomados: %d
//        Valor gasto em pet shops: %.2f
//        """, this.getNome(), this.getQtdBanhosTomados(), this.getValorGastoEmPetShops()
//    );
//  }


  @Override
  public String toString() {
    return "Pet{" +
           "nome='" + nome + '\'' +
           ", qtdBanhosTomados=" + qtdBanhosTomados +
           ", valorGastoEmPetShops=" + valorGastoEmPetShops +
           '}';
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

  public Double getValorGastoEmPetShops() {
    return valorGastoEmPetShops;
  }

  public void setValorGastoEmPetShops(Double valorGastoEmPetShops) {
    this.valorGastoEmPetShops = valorGastoEmPetShops;
  }
}
