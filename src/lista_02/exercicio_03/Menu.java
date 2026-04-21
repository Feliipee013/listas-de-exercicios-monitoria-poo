package lista_02.exercicio_03;

import java.util.Scanner;

public class Menu {
    public void exibirMenu() {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        do {
            System.out.println("Digite uma opção:\n1 - Coxinha\n2 - Pastel\n3 - Bolo\n0 - Sair");
            opcao = sc.nextInt();
        } while(opcao != 0);
    }
}
