package lista1.exercicio_6;

import java.util.Scanner;

public class Termometro {
    Scanner teclado = new Scanner(System.in);

    public void conversorCelsius() {

        double valor;
        String tipo;
        System.out.println("Você quer converter de Celsius para Fahrenheit ou Kelvin:");
        System.out.println("----------------------------------------");
        System.out.println("Observação!");
        System.out.println("F - Fahrenheit");
        System.out.println("K - Kelvin");
        System.out.println("----------------------------------------");
        tipo = teclado.next();
        System.out.println("----------------------------------------");
        System.out.println("Qual o valor em Celsius que você quer converter:");
        valor = teclado.nextDouble();

        switch (tipo) {
            case "F":
                double fahrenheit = (valor * 1.8) + 32;
                System.out.println("Valor em Fahrenheit:");
                System.out.println("°F " + fahrenheit);
                break;
            case "K":
                double kelvin = valor + 273.15;
                System.out.println("Valor em Kelvin:");
                System.out.println("K " + kelvin);
                break;
            default:
                System.out.println("Valor incorreto");
                break;
        }
    }
}
