package lista_05.exercicio_10;

public class Passageiro {
    private String nome;
    private int poltrona;
    private String cpf;

    public Passageiro(String nome, String cpf, int poltrona) {
        this.nome = nome;
        this.cpf = cpf;
        this.poltrona = poltrona;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getPoltrona() {
        return poltrona;
    }
}
