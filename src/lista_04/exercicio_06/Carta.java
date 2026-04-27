package lista_04.exercicio_06;

import java.util.Random;

public class Carta {
    public enum Naipe {
        COPAS, PAUS, OUROS, ESPADAS
    }

    private Naipe naipe;

    public void sortear() {
        Random aleatorio = new Random();

        switch (aleatorio.nextInt(4)) {
            case 0:
                naipe = Naipe.COPAS;
                break;
            case 1:
                naipe = Naipe.PAUS;
                break;
            case 2:
                naipe = Naipe.OUROS;
                break;
            case 3:
                naipe = Naipe.ESPADAS;
                break;
        }
    }

    public void exibir() {
        System.out.println("Naipe sorteado: " + naipe);
    }
}
