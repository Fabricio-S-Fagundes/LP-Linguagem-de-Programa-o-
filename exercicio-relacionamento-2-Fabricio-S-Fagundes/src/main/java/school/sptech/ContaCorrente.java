package school.sptech;
import java.util.ArrayList;
import  java.util.List;

public class ContaCorrente {

    private String titular;
    private String agencia;
    private String numero;
    private ArrayList<OperacaoBancaria> operacoesBancarias;

    public ContaCorrente() {
    }
    public ContaCorrente(String titular, String agencia, String numero, ArrayList<OperacaoBancaria> operacoesBancarias) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.operacoesBancarias = operacoesBancarias;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList<OperacaoBancaria> getOperacoesBancarias() {
        return operacoesBancarias;
    }

    public void setOperacoesBancarias(ArrayList<OperacaoBancaria> operacoesBancarias) {
        this.operacoesBancarias = operacoesBancarias;
    }

    public void adicionar Operacao(String categoria, String descricao, Double valor){

        if (categoria.isBlank()){
            System.out.println("Categoria está vazia");
        }
        else if(valor == null || valor == 0.0){
            System.out.println("Deve colocar um valor maior que zero para operação");
        } else {
            OperacaoBancaria addOperacao = new OperacaoBancaria(categoria, descricao, valor);

            operacoesBancarias.add(addOperacao);
        }

    }

    public ArrayList<OperacaoBancaria> buscarOperacoesPorCategoria(String categoria){

        ArrayList<OperacaoBancaria> operacaoCategoria = new ArrayList<OperacaoBancaria>();

        for(int i = 0; i < operacoesBancarias.size(); i++){
            if (operacoesBancarias.get(i).getCategoria().equalsIgnoreCase(categoria)){
                operacaoCategoria.add(operacoesBancarias.get(i));
            }
        }
        return operacaoCategoria;
    }

    public List<OperacaoBancaria> buscarOperacoesPorValor(Double valor){

        ArrayList<OperacaoBancaria> operacaoValor = new ArrayList<OperacaoBancaria>();

        for(int i = 0; i < operacoesBancarias.size(); i++){
            if (operacoesBancarias.get(i).getValor().equals(valor)){
                operacaoValor.add(operacoesBancarias.get(i));
            }
        }
        return operacaoValor;
    }

    public List<OperacaoBancaria> buscarOperacoesSaida(){

        ArrayList<OperacaoBancaria> operacaoSaida = new ArrayList<OperacaoBancaria>();

        for(int i = 0; i < operacoesBancarias.size(); i++){
            if (operacoesBancarias.get(i).getCategoria().equalsIgnoreCase("saida") || operacoesBancarias.get(i).getValor() < 0.0 ){
                operacaoSaida.add(operacoesBancarias.get(i));
            }
        }
        return operacaoSaida;
    }

    public List<OperacaoBancaria> buscarOperacoesEntrada(){

        ArrayList<OperacaoBancaria> operacaoEntrada = new ArrayList<OperacaoBancaria>();

        for(int i = 0; i < operacoesBancarias.size(); i++){
            if (operacoesBancarias.get(i).getCategoria().equalsIgnoreCase("entrada") || operacoesBancarias.get(i).getValor() > 0.0){
                operacaoEntrada.add(operacoesBancarias.get(i));
            }
        }
        return operacaoEntrada;
    }

    public List<OperacaoBancaria> buscarOperacoesPorDescricao(String descricao){

        ArrayList<OperacaoBancaria> operacaoEntrada = new ArrayList<OperacaoBancaria>();

        for(int i = 0; i < operacoesBancarias.size(); i++){
            if (operacoesBancarias.get(i).getDescricao().toLowerCase().contains(descricao)){
                operacaoEntrada.add(operacoesBancarias.get(i));
            }
        }
        return operacaoEntrada;
    }

    public Double buscarMaiorValor(){

        Double valorMaior = 0.0;

        for(int i = 0; i < operacoesBancarias.size(); i++){
            if (valorMaior == 0.0){
                valorMaior = operacoesBancarias.get(i).getValor();
            } else{
                if (valorMaior > operacoesBancarias.get(i).getValor()){
                    valorMaior = operacoesBancarias.get(i).getValor();
                }
            }
        }

        return valorMaior;
    }

    public Double buscarMenorValor(){
        Double valorMenor = 0.0;

        for(int i = 0; i < operacoesBancarias.size(); i++){
            if (valorMenor.equals(0.0)){
                valorMenor = operacoesBancarias.get(i).getValor();
            } else{
                if (valorMenor > operacoesBancarias.get(i).getValor()){
                    valorMenor = operacoesBancarias.get(i).getValor();
                }
            }
        }
        return valorMenor;
    }

    public Double obterSaldo(){

        Double saldoTotal = 0.0;

        for(int i = 0; i < operacoesBancarias.size(); i++){

            saldoTotal += operacoesBancarias.get(i).getValor();

        }
        return saldoTotal;
    }


}