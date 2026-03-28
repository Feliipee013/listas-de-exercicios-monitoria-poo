package lista1.exercicio_5;

public class Produto {
    public String nome;
    public int quantidadeAtual;

    public void verificarReposicao() {
        if(quantidadeAtual < 5) {
            System.out.println("O produto " + nome + " está com estoque crítico");
        } else if(quantidadeAtual <= 15) {
            System.out.println("O produto " + nome + " está com estoque baixo");
        } else {
            System.out.println("O produto " + nome + " está com estoque ok");
        }
    }
}
