package lista_05.exercicio_07;

public class Tarefa {
    private String titulo;
    private String nivelPrioridade;
    private String status;

    public Tarefa(String titulo, String nivelPrioridade, String status) {
        this.titulo = titulo;
        this.nivelPrioridade = nivelPrioridade;
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNivelPrioridade() {
        return nivelPrioridade;
    }

    public void setNivelPrioridade(String nivelPrioridade) {
        this.nivelPrioridade = nivelPrioridade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
