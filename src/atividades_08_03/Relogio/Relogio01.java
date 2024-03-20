package atividades_08_03.Relogio;

import java.util.Scanner;

public class Relogio01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int hora = 0;
        int minuto = 0;
        int segundo = 0;

        do {
            System.out.print("Digite um segundo: ");
            segundo = leia.nextInt();
            if (segundo > 60){
                System.out.println("------------------------------");
                System.out.println("Digite um segundo menor que 60");
                System.out.println("------------------------------");
            }
        }while (segundo > 60);

        do {
            System.out.print("Digite um minuto: ");
            minuto = leia.nextInt();
            if (minuto > 60){
                System.out.println("-----------------------------");
                System.out.println("Digite um minuto menor que 60");
                System.out.println("-----------------------------");
            }
        }while(minuto > 60);

        do {
            System.out.print("Digite uma hora: ");
            hora = leia.nextInt();
            if(hora == 24){
                hora = 00;
            }else if(hora > 24){
                System.out.println("----------------------------");
                System.out.println("Digite uma hora menor que 24");
                System.out.println("----------------------------");
            }
        }while(hora > 24);

        Relogio relogioD = new Relogio();
        relogioD.segundo = segundo;
        relogioD.minuto = minuto;
        relogioD.hora = hora;

        relogioD.adicionarSegundo(segundo);
        relogioD.adicionarMinuto(minuto);
        relogioD.adicionarHora(hora);
        relogioD.exibirHorario();
    }
}
