package lista_05.exercicio_08;

import java.util.Scanner;

public class Estoque {
    Scanner teclado = new Scanner(System.in);
    Produto produtos[];
    int contador = 0;

    public Estoque(int tamanho) {
        produtos = new Produto[tamanho];
    }

    public void cadastrarProduto() {
        System.out.println("Código: ");
        String codigo = teclado.next();

        for (int i = 0; i < contador; i++) {

            if (produtos[i].getCodigo().equalsIgnoreCase(codigo)) {

                System.out.println("Quantidade para adicionar: ");
                int qtd = teclado.nextInt();

                produtos[i].adicionarEstoque(qtd);

                System.out.println("Estoque atualizado!");

                return;
            }
        }
        System.out.println("-------------------");
        produtos[contador] = new Produto();

        produtos[contador].setCodigo(codigo);

        System.out.println("Nome: ");
        produtos[contador].setNome(teclado.next());

        System.out.println("Preço: ");
        produtos[contador].setPreco(teclado.nextDouble());

        System.out.println("Quantidade: ");
        produtos[contador].setQuantidade_estoque(teclado.nextInt());

        contador++;

        System.out.println("Produto cadastrado!");
         System.out.println("-------------------");
    }

    public void realizarVenda() {
        System.out.println("Código: ");
        String codigo = teclado.next();
        boolean encontrou = false;

        for (int i = 0; i < contador; i++) {
            if (produtos[i].getCodigo().equalsIgnoreCase(codigo)) {
                produtos[i].baixarEstoque(1);
                encontrou = true;
                break;
            }
        }

        if (!encontrou) {
            System.out.println("-------------------");
            System.out.println("Produto não encontrado.");
            System.out.println("-------------------");
        }

    }

    public void listar() {
        System.out.println("Produtos com estoque crítico: ");
        for (int i = 0; i < contador; i++) {
            if (produtos[i].getQuantidade_estoque() < 5) {
                System.out.println("Nome: " + produtos[i].getNome());
                System.out.println("Código: " + produtos[i].getCodigo());
                System.out.println("Preço: " + produtos[i].getPreco());
                System.out.println("Quantidade em estoque: " + produtos[i].getQuantidade_estoque());
                System.out.println("-------------------");
            }
        }
    }
}
