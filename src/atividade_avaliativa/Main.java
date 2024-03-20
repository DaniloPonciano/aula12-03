package atividade_avaliativa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome = " ";
        String departamento = " ";
        float salario = 0;

        System.out.println("Digite o nome do funcionário: ");
        nome = leia.nextLine();
        System.out.println("Digite o departamento que o funcionário trabalha: ");
        departamento = leia.nextLine();
        System.out.println("Digite o salário do funcionário: ");
        salario = leia.nextFloat();

        Funcionario funcionario01 = new Funcionario();

    }
}
