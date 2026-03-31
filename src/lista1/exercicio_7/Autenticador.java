package lista1.exercicio_7;

public class Autenticador {
    public void validar(String senha) {
        /* Uma outra maneira que consegui pensar de resolver para qq constante como String,
            sem a criação de um método auxiliar para checar, foi através do regex(que seria com as classes Pattern e Matcher).
            Voces irão ver regex em LFA, mas caso queiram ver sobre regex em java, sugiro que procure no yt.

            O if poderia ser só isso com regex(o método matches da classe String usa as classes Pattern e Matcher)
            if (senha.matches("^[0-9]+$")) {
            System.out.println("Senha insegura")
            }
         */
        if (senha.length() < 8) {
            System.out.println("Senha curta");
        } else if (soNumero(senha)) {
            System.out.println("Senha insegura");
        } else {
            System.out.println("Senha aceita");
        }
    }

    public boolean soNumero(String senha) {
        for (int i = 0; i < senha.length(); i++) {
            if (senha.charAt(i) != '0' &&
                    senha.charAt(i) != '1' &&
                    senha.charAt(i) != '2' &&
                    senha.charAt(i) != '3' &&
                    senha.charAt(i) != '4' &&
                    senha.charAt(i) != '5' &&
                    senha.charAt(i) != '6' &&
                    senha.charAt(i) != '7' &&
                    senha.charAt(i) != '8' &&
                    senha.charAt(i) != '9')
            // caso tenha encontrado algum char q n seja digito
            {
                return false;
            }
        }
        return true;
    }
}
