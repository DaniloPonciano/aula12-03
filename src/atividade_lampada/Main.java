package atividade_lampada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String escolha = " ";

        System.out.println("Você deseja acender a lâmpada? S(sim) / N(não)");
        System.out.print("Escolha: ");
        escolha = leia.next();

        Lampada lampada1 = new Lampada();

        if (escolha.equalsIgnoreCase("s")){
            lampada1.situacao = false;
            lampada1.desligar();
        }else{
            lampada1.situacao = true;
            lampada1.ligar();
        }
    }
}
