package org.example;

public class ContaCorrente extends ContaBancaria {

    private Double limiteChequeEspecial;

    public ContaCorrente(String nomeCliente, Double limiteChequeEspecial) {
        super(nomeCliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(Double valorSaque) {

        Double valorPermitidoSaque = saldo + limiteChequeEspecial;

        if (valorSaque > 0 && valorSaque <= valorPermitidoSaque){

            saldo -= valorSaque;
            System.out.println("Saque efetuado!!!!");

        }
    }

    public Double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(Double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public String toString() {
        return """
                %s
                Cheque Especial: %.2f"""
                .formatted(super.toString(), limiteChequeEspecial);
    }
}
