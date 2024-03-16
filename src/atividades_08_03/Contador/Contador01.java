package atividades_08_03.Contador;

import java.util.Scanner;

public class Contador01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double valor = 0.0;
        Contador contador01 = new Contador();

        System.out.print("Digite um valor para incrementar: ");
        valor = leia.nextDouble();

        contador01.valor1 = valor;

        contador01.exibirValor();

        System.out.println("Digite um valor para decrementar: ");
        valor = leia.nextDouble();

        contador01.valor2 = valor;

        contador01.exibirValor1();
    }
}
