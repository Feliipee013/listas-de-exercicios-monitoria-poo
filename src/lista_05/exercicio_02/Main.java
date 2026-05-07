public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda(3);

        Contato c1 = new Contato("João", "99999-9999", "joao@email.com");
        Contato c2 = new Contato("Maria", "88888-8888", "maria@email.com");

        agenda.adicionarContato(c1);
        agenda.adicionarContato(c2);

        agenda.listarContatos();
    }
}
