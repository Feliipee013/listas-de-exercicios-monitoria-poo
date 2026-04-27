package lista_04.exercicio_02;

public class ContaBancaria {
    double numero,saldo;

    public ContaBancaria(double numero,double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public void printar(){
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Saldo da conta: " + this.saldo);
    }
}
