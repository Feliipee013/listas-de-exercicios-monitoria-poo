package lista_02.exercicio_02;

import java.util.Scanner;

public class Somador {
    Scanner teclado = new Scanner(System.in);

    public void somarAteN(){
        int n;
        System.out.println("Coloque um valor para 'n': ");
        n = teclado.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
