package lista_05.exercicio_06;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.listarLivrosDisponiveis();

        // Empréstimo
        biblioteca.emprestarLivro("1984");

        System.out.println("\nApós empréstimo:\n");

        biblioteca.listarLivrosDisponiveis();

        // Devolução
        biblioteca.devolverLivro("1984");

        System.out.println("\nApós devolução:\n");

        biblioteca.listarLivrosDisponiveis();
    }
}
