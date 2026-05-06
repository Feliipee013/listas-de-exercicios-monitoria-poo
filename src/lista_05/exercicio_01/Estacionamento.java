package lista_05.exercicio_01;

import java.util.Scanner;

public class Estacionamento {
    private Veiculo[] veiculos = new Veiculo[50];

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 - Estacionar veículo\n2 - Retirar veículo\n3 - Listar vagas\n0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a placa: ");
                    String placa = scanner.next();
                    System.out.print("Digite o modelo do carro: ");
                    scanner.nextLine();
                    String modelo = scanner.nextLine();
                    Veiculo v = new Veiculo(placa, modelo, "10:00");
                    this.estacionarVeiculo(v);
                    break;
                case 2:
                    System.out.print("Digite a placa: ");
                    placa = scanner.next();
                    this.retirarVeiculo(placa);
                    break;
                case 3:
                    this.listarVagas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Digite um número válido");
            }
        } while (opcao != 0);
    }

    public void estacionarVeiculo(Veiculo veiculo) {
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] == null) {
                veiculos[i] = veiculo;
                System.out.println("Veículo estacionado na vaga " + i);
                return;
            }
        }
        System.out.println("Estacionamento cheio!");
    }

    public void retirarVeiculo(String placa) {
        boolean encontrado = false;
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] != null && veiculos[i].getPlaca().equals(placa)) {
                System.out.println("=====Veiculo Saindo=====" +
                        "\nPlaca: " + veiculos[i].getPlaca() +
                        "\nModelo: " + veiculos[i].getModelo() +
                        "\nHorário de entrada: " + veiculos[i].getHoraEntrada() +
                        "\nValor a pagar: R$10,00");
                veiculos[i] = null;
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Veículo não encontrado.");
        }
    }

    public void listarVagas() {
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] != null) {
                System.out.println("Vaga " + i + " ocupada");
            } else {
                System.out.println("Vaga " + i + " livre");
            }
        }
    }
}
