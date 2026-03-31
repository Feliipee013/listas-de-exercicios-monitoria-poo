package lista1.exercicio_4;

import java.util.Scanner;

public class Pedagio {
    Scanner teclado = new Scanner(System.in);

    public void calcularTarifa() {
        String tipo;
        System.out.println("Qual o tipo do veículo(C,M ou Cam):");
        tipo = teclado.next();

        switch (tipo) {
            case "C":
                System.out.println("Tipo de Veículo: Carro");
                System.out.println("Valor da tarifa a ser paga:R$ 10,00");
                break;
            case "M":
                System.out.println("Tipo de Veículo: Moto");
                System.out.println("Valor da tarifa a ser paga:R$ 5,00");
                break;
            case "Cam":
                System.out.println("Tipo de Veículo: Caminhão");
                System.out.println("Valor da tarifa a ser paga:R$ 20,00");
                break;
            default:
                System.out.println("Esse tipo de valor não existe!");
                break;
        }
    }
}
