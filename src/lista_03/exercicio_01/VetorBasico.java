package lista_03.exercicio_01;

public class VetorBasico {
    int []array = new int[10];

    /* inicializando o array pelo construtor. Quando instanciar(usando o 'new VetorBasico()')
    um objeto da classe, fazemos com que cada posição receba um múltiplo de 2.
    obs.: fazemos o (i + 1) pq a primeira posição é o 0
     */
    public VetorBasico() {
        for(int i = 0; i < array.length; i++) {
            this.array[i] = (i + 1) * 2;
        }
    }

    public void imprimirVetor() {
        for(int i = 0; i < array.length; i++) {
            System.out.print(this.array[i]+ " ");
        }
    }
}
