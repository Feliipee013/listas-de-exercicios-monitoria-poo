package lista_04.exercicio_09;

public class Lampada {
    private boolean ligada = false;

    public void ligar() {
        ligada = true;
        System.out.println("A lâmpada foi ligada");
    }

    public void desligar() {
        ligada = false;
        System.out.println("A lâmpada foi desligada");
    }

    public void estadoAtual() {
        System.out.println("A lâmpada está ligada? " + ligada);
    }
}
