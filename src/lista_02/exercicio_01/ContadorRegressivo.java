package lista_02.exercicio_01;

public class ContadorRegressivo {
    public void iniciarContagem(int tempo) {
        System.out.println("!!!Iniciando contagem!!!");
        while(tempo > 0) {
            System.out.println(tempo);
            tempo--;
        }
        System.out.println("FOGO!!!");
    }
}
