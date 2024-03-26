package atividades_08_03.Temperatura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        double celsius = 0.0;
        double fahrenheit = 0.0;

        Temperatura temperatura1 = new Temperatura();
        System.out.print("Digite a temperatura em graus Celsius: ");
        temperatura1.celsius = leia.nextDouble();

        System.out.print("Digite a temperatura em Fahrenheit: ");
        temperatura1.fahrenheit = leia.nextDouble();

        temperatura1.exibirTemperatura();
    }
}
