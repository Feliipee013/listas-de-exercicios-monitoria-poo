package lista_05.exercicio_05;

public class Transacao {
    private String tipoReceita;
    private String descricao;
    private double valor;

    public Transacao(double valor, String descricao, String tipoReceita) {
        this.valor = valor;
        this.descricao = descricao;
        this.tipoReceita = tipoReceita;
    }

    public String getTipoReceita() {
        return tipoReceita;
    }

    public void setTipoReceita(String tipoReceita) {
        this.tipoReceita = tipoReceita;
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
}
