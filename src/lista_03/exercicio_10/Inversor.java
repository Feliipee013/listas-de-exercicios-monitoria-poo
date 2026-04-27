package lista_03.exercicio_10;

public class Inversor {
    public void inversorArray(int[] array) {

        for (int i = 0; i < array.length / 2; i++) { // Coloquei "array.length/2" porque não precisamos ir até o final
                                                     // do arranjo, só até a metade
            int elemento = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = elemento;
        }

        for(int i = 0; i < array.length; i++){
            System.out.print("|" + array[i] + "|" + " ");
        }

    }
}
