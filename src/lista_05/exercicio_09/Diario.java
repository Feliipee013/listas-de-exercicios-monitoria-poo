package lista_05.exercicio_09;

import java.util.Scanner;

public class Diario {
    private Aluno[] alunos = new Aluno[50];

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 - Registrar Aluno\n2 - Listar alunos\n0 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a matrícula:");
                    String matricula = scanner.nextLine();
                    System.out.println("Digite as tres notas");
                    double[] notas = new double[3];
                    for (int i = 0; i < 3; i++) {
                        notas[i] = scanner.nextDouble();

                    }
                    scanner.nextLine();
                    this.adicionarAluno(new Aluno(nome, matricula, notas));
                    break;
                case 2:
                    this.listarAlunos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Digite um número válido");
            }
        } while (opcao != 0);
    }

    private void adicionarAluno(Aluno aluno) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = aluno;
                break;
            }
        }
    }

    private void listarAlunos() {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                double media = alunos[i].calcularNota();
                System.out.println("=====ALUNO: " + alunos[i].getNome() + "====="
                        + "\nMatricula: " + alunos[i].getMatricula()
                        + "\nMédia: " + media);
                if (media >= 7.0) {
                    System.out.println("situação: Aprovado\n");
                } else {
                    System.out.println("situação: Reprovado\n");
                }
            }
        }
    }
}
