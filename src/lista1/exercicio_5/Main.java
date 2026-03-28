package lista1.exercicio_5;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "arroz";
        produto1.quantidadeAtual = 4;

        Produto produto2 = new Produto();
        produto2.nome = "feijão";
        produto2.quantidadeAtual = 5;

        Produto produto3 = new Produto();
        produto3.nome = "macarrão";
        produto3.quantidadeAtual = 16;

        produto1.verificarReposicao();
        produto2.verificarReposicao();
        produto3.verificarReposicao();
    }
}
