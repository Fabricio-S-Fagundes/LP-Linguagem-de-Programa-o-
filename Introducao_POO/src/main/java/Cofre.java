import java.util.concurrent.ThreadLocalRandom;

public class Cofre {

    String meta;
    Boolean estaQuebrado;
    Double dinheiroGuardado;

    void depositar(String proposito ,Double valorGuardar){

        if (estaQuebrado){
            System.out.printf("""
                    Cofrinho %s:
                    
                    Ja era!
                    
                    """, proposito);
        } else{
            dinheiroGuardado += valorGuardar;
            System.out.printf("""
                    Cofrinho %s:
                    
                    Deposito feito com sucesso!
                    
                    """, proposito);
        }
    }

    Double Agitar(Boolean quebrado){

        Double troco = 0.0;

        if (!quebrado){

            troco = ThreadLocalRandom.current().nextDouble(0.0, dinheiroGuardado);

        } else {
            System.out.println("Dinheiro está no chão");
        }
            return troco;
    }

    Boolean quebrar(String reposta){
        if (!estaQuebrado)
            System.out.println("Você deseja quebrar o cofrinho??");
            if (reposta.equalsIgnoreCase("sim")){
                estaQuebrado = true;
                System.out.println("Você quebrou o cofrinho!");
            }

        return estaQuebrado;
    }

}
