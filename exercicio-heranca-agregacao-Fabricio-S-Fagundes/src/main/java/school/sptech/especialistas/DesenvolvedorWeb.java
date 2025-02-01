package school.sptech.especialistas;

import school.sptech.Desenvolvedor;

import java.util.List;

public class DesenvolvedorWeb extends Desenvolvedor{

    private String backend;
    private String frontend;
    private String sgbd;
    private Integer horasMentoria;
    private List<Desenvolvedor> desenvolvedoresWeb;

    public DesenvolvedorWeb(String nome, Integer qtdHoras, Double valorHora, String backend, String frontend, String sgbd, Integer horasMentoria, List<Desenvolvedor> desenvolvedoresWeb) {
        super(nome, qtdHoras, valorHora);
        this.backend = backend;
        this.frontend = frontend;
        this.sgbd = sgbd;
        this.horasMentoria = horasMentoria;
        this.desenvolvedoresWeb = desenvolvedoresWeb;
    }

    public DesenvolvedorWeb(String nome, Integer qtdHoras, Double valorHora) {
        super(nome, qtdHoras, valorHora);
    }

    public Double calcularSalario(){

        horasMentoria = 300;
        valorHora = horasMentoria.doubleValue();

        return qtdHoras * valorHora;
    }

    public Boolean isFullStack(){
            String fullStack;
        if (!backend.isBlank() && !frontend.isBlank() && !sgbd.isBlank()){
            return
        }else {

            return;
        }
    }
}
