package atividades_08_03;

import java.util.Scanner;

public class Contador01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double contIncrement,valor = 0.0;
        Contador contador01 = new Contador();



        System.out.print("Digite um valor para dar início ao contador: ");
        valor = leia.nextDouble();
        contIncrement = contador01.incremento();




    }
}
