package lista1.exercicio_9;

public class Disciplina {

    public void resultadoFinal(float nota1, float nota2) {
        float media = (nota1 + nota2) / 2.0f;
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 4) {
            System.out.println("Exame final");
        } else {
            System.out.println("Reprovado");
        }
    }
}
