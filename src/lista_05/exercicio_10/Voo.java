package lista_05.exercicio_10;

import java.util.Scanner;

public class Voo {
    Scanner teclado = new Scanner(System.in);
    Passageiro assentos[];

    public Voo(int tamanho) {
        assentos = new Passageiro[tamanho];
    }

    public void mostrarAssentos() {

        System.out.println("=== MAPA DE ASSENTOS ===");

        for (int i = 0; i < assentos.length; i++) {

            System.out.print("Assento " + i + ": ");

            if (assentos[i] == null) {

                System.out.println("[ Vazio ]");

            } else {

                System.out.println("[ Ocupado ]");
            }
        }
    }

    public void reservarAssento() {
        System.out.println("Número do assento:");
        int numero = teclado.nextInt();

        if (numero < 0 || numero >= assentos.length) {
            System.out.println("Assento inválido.");
            return;
        }

        if (assentos[numero] != null) {
            System.out.println("Assento já ocupado.");
            return;
        }

        System.out.println("Nome:");
        String nome = teclado.next();

        System.out.println("CPF:");
        String cpf = teclado.next();

        assentos[numero] = new Passageiro(nome, cpf, numero);

        System.out.println("Reserva realizada!");
    }
}
