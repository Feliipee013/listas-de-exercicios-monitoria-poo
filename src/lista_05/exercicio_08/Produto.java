package lista_05.exercicio_08;

public class Produto {
    String codigo,nome;
    int quantidade_estoque;
    double preco;

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void adicionarEstoque(int quantidade){
        this.quantidade_estoque = this.quantidade_estoque + quantidade;
    }

    
    public void baixarEstoque(int quantidade){
        if(quantidade >=quantidade_estoque){
            System.out.println("Não tem essa quantidade toda no estoque para conseguir remover");
        }else{
             this.quantidade_estoque = this.quantidade_estoque - quantidade;
        }
    }
}
