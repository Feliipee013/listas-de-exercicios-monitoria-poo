package lista_04.exercicio_07;
// importando importar todos os métodos estáticos da classe "Math"
import static java.lang.Math.*;


public class UsoMath {
    public void calcularHipotenusa(double co, double ca) {
        double somaDosQuadradosDosCatetos = pow(co, 2) + pow(ca, 2);
        System.out.println(sqrt(somaDosQuadradosDosCatetos));

        // tem o método hypot() que já faz isso de cima direto
        //System.out.println(hypor(co, ca));
    }
}
