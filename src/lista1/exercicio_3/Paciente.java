package lista1.exercicio_3;

public class Paciente {
    public double peso;
    public double altura;

    public void diagnosticar() {
        // calculando o imc
        double imc = peso / (altura * altura);

        if(imc < 18.5) {
            System.out.println("Abaixo do peso");
        }
        /* Note que se chegou nesse else if abaixo, logo o peso era maior ou igual a 18.5, então
           não é necessário colocar algo como: (imc >= 18.5 && imc <= 24.9).
           A mesmo coisa vale para os próximos condicionas.
        */
        else if (imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}
