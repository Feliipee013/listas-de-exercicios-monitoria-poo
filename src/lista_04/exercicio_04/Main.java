package lista_04.exercicio_04;

public class Main {
    public static void main(String[] args) {
        Tempo tempo = new Tempo();
        Tempo tempo2 = new Tempo(2);
        Tempo tempo3 = new Tempo(2, 30, 30);

        tempo.printar();
        tempo2.printar();
        tempo3.printar();
    }
}
