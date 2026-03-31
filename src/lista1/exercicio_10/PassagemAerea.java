package lista1.exercicio_10;

import java.util.Scanner;

public class PassagemAerea {
    Scanner teclado = new Scanner(System.in);
    public void definirAssento(){
        int tipo;
        System.out.println("Qual a classe do voo:");
        System.out.println("----------------------------------------");
        System.out.println("Observação!");
        System.out.println("1 - Econômica");
        System.out.println("2 - Executiva");
        System.out.println("3 - Primeira Classe");
        System.out.println("----------------------------------------");
        tipo = teclado.nextInt();
        
        switch (tipo) {
            case 1:
                System.out.println("Você só tem direito a água");
                break;
            case 2:
                System.out.println("Você tem direito a água e pão com manteiga");
                break;
            case 3:
                System.out.println("Você tem direito a águo, pão com manteiga e um pudim");    
                break;
            default:
                System.out.println("Valor Inválido");
                break;
        }
    }
}
