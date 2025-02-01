package org.example;

public class ALunoPos extends Aluno {

    private Double notaTCC;

    public ALunoPos(String nome, Double notaAtividade, Double notaAvaliacao, Double notaTCC) {
        super(nome, notaAtividade, notaAvaliacao);
        this.notaTCC = notaTCC;
    }

    @Override
    public Double calcularNotaFinal() {
        return (this.getNotaAtividade()*0.4)+(this.getNotaAvaliacao()*0.6)+(this.notaTCC*0.8);
    }

    @Override
    public String toString() {
        return "ALunoPos{" +
                "notaTCC=" + notaTCC +
                "} " + super.toString();
    }

    //    public ALunoPos(String nome, Double notaAtividade, Double notaAvaliacao) {
//        super(nome, notaAtividade, notaAvaliacao);
//    }
}
