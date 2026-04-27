package lista_03.exercicio_04;

import java.util.Scanner;

public class Histograma {
    Scanner teclado = new Scanner(System.in);

    public void frequenciaNotas() {
        int quantidadeNotas = 20;
        int notas[] = new int[quantidadeNotas];
        int frequencia[] = new int[5];

        System.out.println("Coloque as notas: ");
        for (int i = 0; i < quantidadeNotas; i++) { // Transformei a nota em um índice, então tipo, no índice 0 vai ser
                                                    // a nota 1, no índice 1 vai ser a nota 2, e por aí vai
            System.out.println("Nota " + (i + 1) + ":");
            notas[i] = teclado.nextInt();

            if (notas[i] >= 1 && notas[i] <= 5) { // Verificação para ver se a nota tá entre 1 e 5
                frequencia[notas[i] - 1]++; // Exemplo: notas[0] = 1, então toda vez que a nota for 1, ele vai aumentar
                                            // o contudador no array de frequência, ou seja, frequencia[0] = contador +
                                            // 1
            } else {
                System.out.println("Nota inválida!");
                i--;
            }
        }

        System.out.println("\nFrequência das notas:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nota " + (i + 1) + ": " + frequencia[i]);
        }
    }
}
