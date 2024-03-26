package atividades_08_03.Estudante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        double nota = 0;
//        int iNota = 0;

        Estudante estudante1 = new Estudante();
        System.out.print("Digite o nome do estudante: ");
        estudante1.nome = leia.nextLine();

        for (int i = 0; i < 4; i++) {
            i++;
            System.out.print("Digite a " + i + "a nota do aluno: ");
            nota = leia.nextDouble();
            estudante1.nota = nota;
        }

        estudante1.exibirNota();
    }
}
