package lista_05.exercicio_04;

public class Pagamento {
    private String descricao;
    private double valor;
    private String statusPagamento;

    public Pagamento() {
    }

    public Pagamento(String descricao, double valor, String statusPagamento) {
        this.descricao = descricao;
        this.valor = valor;
        this.statusPagamento = statusPagamento;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }
}
