package lista_04.exercicio_09;

public class Main {
    public static void main(String[] args) {
        // A instanciação de um objeto ocorre quando usamos a palavra reservada new
        Lampada lampada = new Lampada();
        lampada.estadoAtual();
        lampada.ligar();
        lampada.estadoAtual();
        lampada.desligar();
    }
}
