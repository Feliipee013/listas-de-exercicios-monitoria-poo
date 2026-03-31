package lista1.exercicio_7;

public class Main {
    public static void main(String[] args) {
        String senha1 = "senha12345";
        String senha2 = "senha";
        String senha3 = "0123456789";
        String senha4 = "0123456789a";


        Autenticador autenticador = new Autenticador();
        autenticador.validar(senha1);
        autenticador.validar(senha2);
        autenticador.validar(senha3);
        autenticador.validar(senha4);

    }
}
