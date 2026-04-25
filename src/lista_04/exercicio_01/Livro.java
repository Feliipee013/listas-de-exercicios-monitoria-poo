package lista_04.exercicio_01;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirDetahes() {
        System.out.println("==========LIVRO==========" +
                "\nTítulo: " + titulo +
                "\nAutor: " + autor +
                "\nAno de Publicação: " + anoPublicacao +
                "\n=========================");
    }
}
