package lista_02.exercicio_10;

import java.util.Scanner;

public class Matematica {
    Scanner teclado = new Scanner(System.in);

    public void calcularFatorial(){
        int valor;
        int resultado;
        System.out.println("Coloque o valor que deseja saber o fatorial: ");
        valor = teclado.nextInt();
        resultado=valor;

        for(int i=(valor-1);i>0;i--){
            resultado = resultado * (i);
        }
        System.out.println(resultado);
    }
}
