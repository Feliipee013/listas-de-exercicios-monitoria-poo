package lista_04.exercicio_02;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria(123, 1500);
        ContaBancaria contaBancaria2 = new ContaBancaria(321, 3000);

        contaBancaria1.printar();
        System.out.println();
        contaBancaria2.printar();
    }
}
