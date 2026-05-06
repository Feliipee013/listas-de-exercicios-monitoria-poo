    package lista_05.exercicio_09;

    public class Aluno {
        private String nome;
        private String matricula;
        private double[] notas = new double[3];

        public Aluno(String nome, String matricula, double[] notas) {
            this.nome = nome;
            this.matricula = matricula;
            this.notas = notas;
        }

        public double calcularNota() {
            double media = 0.0;

            for (int i = 0; i < notas.length; i++) {
                media += notas[i];
            }
            return media/notas.length;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }
    }
