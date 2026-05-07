package lista_05.exercicio_08;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque(10);

        estoque.cadastrarProduto();
        estoque.cadastrarProduto();
        estoque.cadastrarProduto();
        estoque.realizarVenda();
        estoque.listar();
    }
}
