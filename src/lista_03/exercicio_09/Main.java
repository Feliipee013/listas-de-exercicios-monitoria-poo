package lista_03.exercicio_09;

public class Main {
    public static void main(String[] args) {
        BuscaString buscaString = new BuscaString();
        System.out.println(buscaString.encontrarLinguagem("Haskell"));
        System.out.println(buscaString.encontrarLinguagem("Elixir"));
        System.out.println(buscaString.encontrarLinguagem("PytHoN"));
        System.out.println(buscaString.encontrarLinguagem("   LUA   "));
    }
}
