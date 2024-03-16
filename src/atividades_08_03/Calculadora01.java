package atividades_08_03;

import java.util.Scanner;

public class Calculadora01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double soma,n1,n2 = 0;
        double subtrai = 0;
        double multiplica = 0;
        double divide = 0;
        Calculadora calculadora = new Calculadora();

        System.out.print("Digite o primeiro valor a ser somado: ");
        n1 = leia.nextDouble();
        System.out.print("Digite o segundo valor a ser somado: ");
        n2 = leia.nextDouble();

        soma = calculadora.somar(n1,n2);
        System.out.println("Resultado: " + soma);

        n1 = 0;
        n2 = 0;

        System.out.print("Digite o primeiro valor a ser subtraido: ");
        n1 = leia.nextDouble();
        System.out.print("Digite o segundo valor a ser subtraido: ");
        n2 = leia.nextDouble();

        subtrai = calculadora.subtrair(n1,n2);
        System.out.println("Resultado: " + subtrai);

        n1 = 0;
        n2 = 0;

        System.out.print("Digite o primeiro valor a ser multiplicado: ");
        n1 = leia.nextDouble();
        System.out.print("Digite o segundo valor a ser multiplicado: ");
        n2 = leia.nextDouble();

        multiplica = calculadora.multiplicar(n1,n2);
        System.out.println("Resultado: " + multiplica);

        n1 = 0;
        n2 = 0;

        System.out.print("Digite o valor a ser dividido: ");
        n1 = leia.nextDouble();
        System.out.print("Digite o número para ser o dividendo: ");
        n2 = leia.nextDouble();

        divide = calculadora.dividir(n1,n2);
        System.out.println("Resultado: " + divide);
    }
}
