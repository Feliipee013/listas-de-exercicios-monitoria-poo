package lista_05.exercicio_05;

import java.util.Scanner;

public class LivroCaixa {
    private Transacao []transacoes = new Transacao[50];

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 - Registrar Transação\n2 - Calcular Saldo Final\n0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a o tipo da transação('receita' ou 'despesa'): ");
                    String tipo = scanner.next();
                    scanner.nextLine();
                    System.out.print("Digite o valor:");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digite uma descrição");
                    String descricao = scanner.nextLine();
                    this.adicionarTransacao(new Transacao(valor, descricao, tipo));
                    break;
                case 2:
                    this.calcularReceita();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Digite um número válido");
            }
        } while (opcao != 0);
    }

    private void adicionarTransacao(Transacao transacao) {
        for (int i = 0; i < transacoes.length; i++) {
            if(transacoes[i] == null) {
                transacoes[i] = transacao;
                break;
            }
        }
    }

    private void calcularReceita() {
        double receita = 0.0;
        double despesa = 0.0;
        for (int i = 0; i < transacoes.length; i++) {
            if(transacoes[i] != null ) {
                if(transacoes[i].getTipoReceita().equals("receita")) {
                    receita += transacoes[i].getValor();
                } else {
                    despesa += transacoes[i].getValor();
                }
            }
        }
        System.out.println("Seu saldo final é: R$" + (receita - despesa));
    }
}
