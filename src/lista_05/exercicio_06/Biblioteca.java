package lista_05.exercicio_06;

import java.util.Scanner;

public class Biblioteca {

    Scanner teclado = new Scanner(System.in);
    Livro[] acervo;

    public Biblioteca() {

        acervo = new Livro[5];

        acervo[0] = new Livro("Dom Casmurro", "Machado de Assis");
        acervo[1] = new Livro("1984", "George Orwell");
        acervo[2] = new Livro("O Hobbit", "J.R.R. Tolkien");
        acervo[3] = new Livro("Harry Potter", "J.K. Rowling");
        acervo[4] = new Livro("Percy Jackson", "Rick Riordan");
    }

     public void listarLivrosDisponiveis() {

        System.out.println("=== LIVROS DISPONÍVEIS ===");

        for (int i = 0; i < acervo.length; i++) {

            if (acervo[i].Disponivel()) {

                System.out.println("Título: " + acervo[i].getTitulo());
                System.out.println("Autor: " + acervo[i].getAutor());
                System.out.println("-------------------------");
            }
        }
    }

     public void emprestarLivro(String titulo) {

        for (int i = 0; i < acervo.length; i++) {

            if (acervo[i].getTitulo().equalsIgnoreCase(titulo)) {

                if (acervo[i].Disponivel()) {
                    acervo[i].emprestar();
                    System.out.println("==============================================");
                    System.out.println("O livro " + acervo[i].getTitulo() + " foi emprestado!");
                    System.out.println("==============================================");
                } else {
                    System.out.println("==============================================");
                    System.out.println("Livro já está emprestado.");
                    System.out.println("==============================================");
                }

                break;
            }
        }
    }

    public void devolverLivro(String titulo) {

        for (int i = 0; i < acervo.length; i++) {

            if (acervo[i].getTitulo().equalsIgnoreCase(titulo)) {

                acervo[i].devolver();
                 System.out.println("==============================================");
                 System.out.println("O livro " + acervo[i].getTitulo() + " foi devolvido!");
                 System.out.println("==============================================");
                break;
            }
        }
    }

}
