package lista_03.exercicio_09;

public class BuscaString {
    String[] linguagens = new String[]{"java", "c", "lua", "go", "python"};

    public int encontrarLinguagem(String linguagem) {
        // O método trim() vai remover os espaços em brancos do iníco e do fim da string;
        // jpa  toLowerCase() irá colocar a string passada em minúscula
        linguagem = linguagem.trim().toLowerCase();
        for (int i = 0; i < linguagens.length; i++) {
            if (linguagens[i].equals(linguagem)) {
                return i;
            }
        }
        return -1;
    }
}
