package lista_04.exercicio_01;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("Memórias Póstumas de Brás Cubas");
        livro.setAutor("Machado de Assis");
        livro.setAnoPublicacao(1881);

        livro.exibirDetahes();
    }
}
