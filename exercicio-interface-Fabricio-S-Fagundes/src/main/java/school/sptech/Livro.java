package school.sptech;

public class Livro extends Produto{

    private String nome;

    private String autor;

    private String isbn;

    public Livro(Integer codigo, Double precoDouble, String nome, String autor, String isbn) {
        super(codigo, precoDouble);
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public Double getValorVenda() {
        return getPrecoDouble() * 0.10;
    }

    @Override
    public String toString() {
        return "Livro {" +
                "Titulo ='" + nome + '\'' +
                ", Autor ='" + autor + '\'' +
                ", isbn ='" + isbn + '\'' +
                "} " + super.toString();
    }
}
