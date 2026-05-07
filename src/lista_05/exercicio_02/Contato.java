public class Contato {
    private String nome;
    private String email;
    private String numero;

    public Contato(){}

    public Contato(String nome, String email, String numero){
        this.nome = nome;
        this.email = email;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void exibirContato() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + numero);
        System.out.println("Email: " + email);
    }
}
