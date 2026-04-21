package lista_02.exercicio_07;

public class Desenhista {
    public void desenharQuadrado(int t) {
        for(int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                // uso somente do print para n quebrar linha
                System.out.print("* ");
            }
            // usando o println para quebra linhas
            System.out.println();
        }
    }
}
