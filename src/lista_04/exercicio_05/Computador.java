package lista_04.exercicio_05;

public class Computador {
    private Processador processador;
    private String memoria;
    private String hd;

    // Poderíamos usar construtor vazio + setters,
    // porém ao fazer isso precisaríamos tratar casos onde o processador pode ser null.
    // Além disso, ao criar o processador diretamente no construtor,
    // garantimos a composição (o computador sempre terá um processador).
    public Computador(String marcaProcessador, String frequenciaProcessador, String memoria, String hd) {
        processador = new Processador(marcaProcessador, frequenciaProcessador);
        this.memoria = memoria;
        this.hd = hd;
    }

    public void exibirDetalhes() {
        System.out.println("=====COMPUTADOR=====\n" +
                "Processador: " + processador.getMarca() + " " + processador.getFrequencia() +
                "\nMemória RAM: " + memoria +
                "\nHD: " + hd + "" +
                "\n====================");
    }
}
