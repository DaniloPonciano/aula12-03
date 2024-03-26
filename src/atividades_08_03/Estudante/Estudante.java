package atividades_08_03.Estudante;

public class Estudante {
    String nome = " ";
    double[] nota = new double[0];

    public void adicionarNota(){
        for (int i = 0; i < 4; i++) {
            i++;
            this.nota[i] += this.nota[i];
        }
    }

    public void exibirNota(){
        for (int i = 0; i < 4; i++) {
            i++;
            System.out.println("TOTAL DE NOTAS ALUNO: " + this.nome);
            System.out.println("Nota " + i + ": " + this.nota[i]);
        }
    }

}
