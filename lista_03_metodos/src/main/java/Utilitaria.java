import  java.util.List;

public class Utilitaria {

    void exibirMensagem(){
        System.out.println("Olá, mundo!");
    }

    Integer somar(Integer numero1, Integer numero2){
        return numero1 + numero2;
    }

    void exibirLista(List<String> lista ){
        for(int i = 0; i < lista.size(); i ++){

            System.out.println(lista.get(i));

        }
    }

    Boolean existeNaLista(List<String> lista, String pesquisa){

        Boolean encontrou = false;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equalsIgnoreCase(pesquisa)) {
                encontrou = true;
            }
        }
        return encontrou;

    }

    void exibirMensagemDaLista(Boolean existe, String tipo){

        if(existe){
            System.out.println(tipo + " Existe na lista");
        }else{
            System.out.println(tipo + " Não existe na lista");
        }


    }

}
