package lista_05.exercicio_03;

import lista_05.exercicio_01.Veiculo;

import java.util.Scanner;

public class FilaAtendimento {
    // fiz só comum array, mas poderia ser feito com dois arrays (um pra cada tipo de fila).
    private Senha[] senhas = new Senha[50];
    private int count = 0;

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 - Gerar Senha\n2 - Próxima Senha\n0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a o tipo da senha(preferencial ou normal): ");
                    String tipo = scanner.next();
                    this.gerarSenha(tipo);
                    break;
                case 2:
                    this.proximaSenha();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Digite um número válido");
            }
        } while (opcao != 0);
    }

    private void gerarSenha(String tipo) {
        Senha senha = new Senha(count++, tipo);

        for (int i = 0; i < senhas.length; i++) {
            if (senhas[i] == null) {
                senhas[i] = senha;
                System.out.println("Senha gerada: " + senha.getNumero() + " (" + tipo + ")");
                return;
            }
        }

        System.out.println("Fila cheia!");
    }

    private void proximaSenha() {
        // Primeiro tenta achar preferencial
        for (int i = 0; i < senhas.length; i++) {
            if (senhas[i] != null && senhas[i].getTipo().equalsIgnoreCase("preferencial")) {
                System.out.println("Chamando senha: " + senhas[i].getNumero() + " (" + senhas[i].getTipo() + ")");
                senhas[i] = null; // removendo do arranjo das senhas
                return;
            }
        }

        // Se não tiver preferencial, chama as senhas normais
        for (int i = 0; i < senhas.length; i++) {
            if (senhas[i] != null) {
                System.out.println("Chamando senha: " + senhas[i].getNumero() + " (" + senhas[i].getTipo() + ")");
                senhas[i] = null; // remove
                return;
            }
        }

        //Se não tiver nenhuma senha
        System.out.println("Nenhuma senha na fila.");
    }
}
