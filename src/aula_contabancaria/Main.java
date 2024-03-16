package aula_contabancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double valor = 0.0;
        double saque = 0.0;

        ContaBancaria conta1 = new ContaBancaria();
        System.out.print("Informe o valor de depósito: ");
        valor = leia.nextDouble();

        conta1.depositar(valor);
        conta1.exibirSaldo();

        System.out.print("Informe o valor do saque: ");
        saque = leia.nextDouble();

        conta1.sacar(saque);
        conta1.exibirSaldo();
    }

}