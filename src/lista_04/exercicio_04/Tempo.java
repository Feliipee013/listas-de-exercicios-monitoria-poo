package lista_04.exercicio_04;

public class Tempo {
    private int horas, minutos, segundos;

    public Tempo() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Tempo(int horas) {
        this.horas = horas;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Tempo(int horas,int minutos,int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void printar(){
        System.out.println("Horas: " + this.horas);
        
        System.out.println("Minutos: " + this.minutos);
        
        System.out.println("Segundos: " + this.segundos);
    }
}
