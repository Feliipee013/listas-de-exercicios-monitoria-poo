package lista1.exercicio_1;

public class Main {
    public static void main(String[] args) {
        SimuladorFinanciamento simuladorFinanciamento = new SimuladorFinanciamento();
        // salário <= 30%
        simuladorFinanciamento.analisarEmprestimo(100, 30);
        // salário > 30%
        simuladorFinanciamento.analisarEmprestimo(100, 31);
    }
}
