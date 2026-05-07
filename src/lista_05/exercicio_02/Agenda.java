public class Agenda {
    private Contato[] contatos;
    private int contador =0;
    public Agenda(int tamanho) {
        contatos = new Contato[tamanho];
    }

    public void adicionarContato(Contato contato) {
        if (contador<contatos.length) {
            contatos[contador] = contato;
            contador++;
        } else {
            System.out.println("Posição inválida!");
        }
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            if (contato != null) {
                contato.exibirContato();
                System.out.println("----------------");
            }
        }
    }
}
