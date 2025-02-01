public class ContaBancaria {

    private String nomeTitular;

    private String codigoConta;

    private Integer agencia;

    private Double saldo;

    // Construtor:
    // O Construtor é sempre publico
    // O Construtor sempre tem o mesmo nome da classe
    // Não tem retorno

//    public ContaBancaria(String nomeTitular){
//        this.nomeTitular = nomeTitular;
//
//    }


    // construtor
    public ContaBancaria(String nomeTitular, Double saldo, String codigoConta, Integer agencia) {
        this.nomeTitular = nomeTitular;
        this.codigoConta = codigoConta;
        this.agencia = agencia;
        this.saldo = 0.0;
    }

    // metodo
    public void sacar(Double valorSaque){
        if(valorSaque <= 0 || valorSaque > saldo){
            System.out.println("Não é possivél sacar");
        } else {
            saldo -= valorSaque;
        }
    }

    // GET
    // SET

    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular(){
        return nomeTitular;
    }

    public String getCodigoConta() {
        return codigoConta;
    }

    public void setCodigoConta(String codigoConta) {
        this.codigoConta = codigoConta;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
