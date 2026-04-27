package lista_03.exercicio_07;

public class Matriz {
    int[][] matriz = new int[3][3];

    public Matriz() {
        //matriz.length pega o número de linhas
        for (int i = 0; i < matriz.length; i++) {
            //matriz[i].length pega o número de colunas na linha i
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                }
            }
        }
    }

    public void imprimirMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // System.out.print imprime na mesma linha
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
