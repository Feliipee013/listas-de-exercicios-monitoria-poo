package lista_05.exercicio_10;

public class Main {
    public static void main(String[] args) {
        Voo voo = new Voo(5);
       
        voo.mostrarAssentos();       
        voo.reservarAssento();
        voo.reservarAssento();  
        System.out.println("\nApós reservas:\n");
        voo.mostrarAssentos();
    }
}
