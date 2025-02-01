package org.example;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

    private String nomeGrupo;

    private List<Contato> contatos;

    public Grupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
        this.contatos =  new ArrayList<>();
    }

    public void adicionar(Contato c){
        contatos.add(c);
    }

    public void exibirContatos(){
        System.out.println("Contatos: ");
        for ( Contato contatosDaVez : contatos){
            System.out.println(contatosDaVez);
        }
    }

    public Boolean exibirPorNome(String nomePesquisado){

        for (Contato contato : contatos) {
            if (contato.getNome().equals(nomePesquisado)){
                return true;
            }
        }
        return false;
    }

    public Contato buscarPeloNome(String nome){

        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)){
                return contato;
            }
        }
        return null;
        }


    public void remover(Contato c){
        contatos.remove(c);
    }

    @Override
    public String toString() {
        return """
               --------------------------
               Nome do grupo: %s
               Lista de contatos: %s
               --------------------------
               """.formatted(nomeGrupo, contatos);
        }
}

