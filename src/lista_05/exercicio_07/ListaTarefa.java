package lista_05.exercicio_07;

import java.util.Scanner;

public class ListaTarefa {
    private Tarefa[] tarefas = new Tarefa[50];

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 - Adicionar Tarefa\n2 - Concluir Tarefa\n3 - Listar Tarefas\n0 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o nível de prioridade ('alta', 'media', 'baixa'): ");
                    String prioridade = scanner.nextLine();
                    System.out.println("Digite o status ('pendente', 'concluida'):");
                    String status = scanner.nextLine();
                    this.adicionarTarefea(new Tarefa(titulo, prioridade, status));
                    break;
                case 2:
                    this.listarTarefas(1);
                    System.out.print("Digite o índice da tarefa que deseja concluir: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine();
                    this.concluirTarefa(indice);
                    break;
                case 3:
                    System.out.println("1 - Todas\n2 - Pendentes\n3 - Concluídas");
                    int filtro = scanner.nextInt();
                    scanner.nextLine();
                    this.listarTarefas(filtro);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Digite um número válido");
            }
        } while (opcao != 0);
    }

    private void adicionarTarefea(Tarefa tarefa) {
        for (int i = 0; i < tarefas.length; i++) {
            if (tarefas[i] == null) {
                tarefas[i] = tarefa;
                break;
            }
        }
    }

    private void concluirTarefa(int indice) {
        if (tarefas[indice] == null) {
            System.out.println("Digite o índice de uma tarefa válida");
            return;
        }

        if (tarefas[indice].getStatus().equalsIgnoreCase("concluida")) {
            System.out.println("Tarefa já foi concluida");
            return;
        }

        tarefas[indice].setStatus("concluida");
        System.out.println("Tarefa concluida");
    }

    private void listarTarefas(int filtro) {
        switch (filtro) {
            case 1:
                for (int i = 0; i < tarefas.length; i++) {
                    if (tarefas[i] != null) {
                        exibirTarefa(i);
                    }
                }
                break;

            case 2:
                for (int i = 0; i < tarefas.length; i++) {
                    if (tarefas[i] != null && tarefas[i].getStatus().equalsIgnoreCase("pendente")) {
                        exibirTarefa(i);
                    }
                }
                break;

            case 3:
                for (int i = 0; i < tarefas.length; i++) {
                    if (tarefas[i] != null && tarefas[i].getStatus().equalsIgnoreCase("concluida")) {
                        exibirTarefa(i);
                    }
                }
                break;

            default:
                System.out.println("Opção inválida");
        }
    }

    private void exibirTarefa(int i) {
        System.out.println("TAREFA " + i
                + "\nTítulo: " + tarefas[i].getTitulo()
                + "\nPrioridade: " + tarefas[i].getNivelPrioridade()
                + "\nStatus: " + tarefas[i].getStatus()
                + "\n============");
    }
}
