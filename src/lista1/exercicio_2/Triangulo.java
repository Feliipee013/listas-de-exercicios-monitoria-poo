public class Triangulo {
    public double lado1;
    public double lado2;
    public double lado3;

    public void tipoTriangulo() {

        if (lado1 > 0 && lado2 > 0 && lado3 > 0) {
            if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {

                if (lado1 == lado2 && lado2 == lado3) {
                    System.out.println("Equilátero");
                } else if ((lado1 == lado2 && lado2 != lado3) || (lado2 == lado3 && lado2 != lado1)
                        || (lado1 == lado3 && lado1 != lado2)) {
                    System.out.println("Isósceles");
                } else {
                    System.out.println("Escaleno");
                }
            } else {
                System.out.println("Com esses valores não é possível formar um triângulo");
            }

        } else {
            System.out.println("Os lados devem ser maiores que zero");
        }
    }
}
