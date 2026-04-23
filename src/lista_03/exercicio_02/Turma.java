public class Turma {
    public void calculoMedia(){
        double notas [] = {10.0,9.2,7.6,8.4,8.8};
        double soma_notas=0;

        for(int i=0;i<notas.length;i++){
            soma_notas += notas[i];
        }

        double media = soma_notas/notas.length;
        System.out.println("Média: " + media);
    }
}
