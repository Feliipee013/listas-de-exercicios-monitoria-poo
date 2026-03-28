package lista1.exercicio_1;

public class SimuladorFinanciamento {
    public void analisarEmprestimo(double salario, double parcela) {
        if(parcela > salario * 0.3) { // checando se a parcela é > 30% do salário
            System.out.println("Negado");
        } else {
            System.out.println("Aprovado");
        }
    }
}
