package org.example.atleta;

public interface Corredor {

    // interfaces não podem ter instnacias de objetos, iguais as classes abstratas
    void correr();

    // com classes abstratas e de interface, não é possivel chamar uma variavél de um objeto instanciada apartida
    // da interface mesmo q seja de outra classe
    // EX: Corredor triatleta1 = new Triatleta
    // o getNome() não funcionaria- 



}
