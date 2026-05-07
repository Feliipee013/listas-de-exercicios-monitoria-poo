package lista_05.exercicio_04;

import java.util.*;

public class SistemaPagamentos {
    Scanner teclado = new Scanner(System.in);
    Pagamento pagamentos[];
    int contador = 0;
    double total_pago = 0;

    public SistemaPagamentos(int tamanho) {
        pagamentos = new Pagamento[tamanho];
    }

    public void cadastroContas() {
        if (contador < pagamentos.length) {
            System.out.println("Valor da conta ?");
            pagamentos[contador].setValor(teclado.nextDouble());
            System.out.println("Descrição: ");
            pagamentos[contador].setDescricao(teclado.next());
            pagamentos[contador].setStatusPagamento("pendente");
            System.out.println("Conta cadastrada com sucesso!");
            contador++;
        } else {
            System.out.println("Não tem mais espaço");
        }

    }

    public void listagemContas() {
        for (int i = 0; i < contador; i++) {
            if (pagamentos[i].getStatusPagamento().equalsIgnoreCase("pendente"))
                System.out.println("Conta " + (i + 1));
                System.out.println("Valor" + pagamentos[i].getValor());
                System.out.println("Descrição" + pagamentos[i].getDescricao());
                System.out.println("-----------------------------------");
        }
    }

    public void realizarPagamento(Pagamento pagamento) {

        boolean encontrou = false;

        for (int i = 0; i < contador; i++) {

            if (pagamentos[i].getDescricao().equals(pagamento.getDescricao())
                    && pagamentos[i].getValor() == pagamento.getValor()) {

                pagamentos[i].setStatusPagamento("pago");

                System.out.println("Pagamento realizado!");

                encontrou = true;
                break;
            }
        }

        if (!encontrou) {
            System.out.println("Conta não encontrada");
        }
    }

    public void totalPago() {

        double total = 0;

        for (int i = 0; i < contador; i++) {

            if (pagamentos[i].getStatusPagamento().equalsIgnoreCase("pago")) {

                total += pagamentos[i].getValor();
            }
        }

        System.out.println("Total pago: R$ " + total);
    }
}
