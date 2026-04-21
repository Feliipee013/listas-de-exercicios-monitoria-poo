package lista_02.exercicio_08;

import java.util.*;

public class Advinhacao {
    Scanner teclado = new Scanner(System.in);

    public void chute() {

        int x = (int) (Math.random() * 10) + 1;
        int chute;

        do {
            System.out.println("Chute um valor entre 1 e 10: ");
            chute = teclado.nextInt();
        } while (chute != x);
        System.out.println();
        System.out.println("Parabénss, você acertou!!!");
    }
}
