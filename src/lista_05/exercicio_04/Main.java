package lista_05.exercicio_04;

public class Main {
    public static void main(String[] args) {
        SistemaPagamentos sistema = new SistemaPagamentos(5);
        Pagamento p1 = new Pagamento("Internet", 120.0, "pendente");
        Pagamento p2 = new Pagamento("Energia", 250.0, "pendente");
        Pagamento p3 = new Pagamento("Água", 90.0, "pendente");

        // Adicionando no sistema
        sistema.pagamentos[0] = p1;
        sistema.pagamentos[1] = p2;
        sistema.pagamentos[2] = p3;

        sistema.contador = 3;

        // Listando contas pendentes
        System.out.println("=== CONTAS PENDENTES ===");
        sistema.listagemContas();

        // Realizando pagamento
        sistema.realizarPagamento(p2);

        // Listando novamente
        System.out.println("\n=== APÓS PAGAMENTO ===");
        sistema.listagemContas();

        // Mostrando total pago
        System.out.println("\n=== TOTAL PAGO ===");
        sistema.totalPago();
    }
}
