package school.sptech;

public enum DiaDaSemana {

    SEGUNDA(2),
    TERCA(3),
    QUARTA(4),
    QUINTA(5),
    SEXTA(6),
    SABADO(7),
    DOMINGO(1 );

    private final Integer dia;

    DiaDaSemana(Integer dia) {
        this.dia = dia;
    }
}
