package lista1.exercicio_8;

import java.util.Scanner;

public class Pedido {
    Scanner teclado = new Scanner(System.in);

    public void aplicarDesconto() {
        System.out.println("Qual o valor total da compra:");
        double valor_total = teclado.nextDouble();

        if (valor_total > 500) {
            double novo_valor_total = valor_total - (valor_total * (15.0 / 100.0));
            System.out.println("Valor com desconto de 15% aplicado: " + novo_valor_total);
        } else if (valor_total >= 200) {
            double novo_valor_total = valor_total - (valor_total * (10.0 / 100.0));
            System.out.println("Valor com desconto de 10% aplicado: " + novo_valor_total);
        } else {
            System.out.println("O valor total não possui nenhum desconto");
        }
    }
}
