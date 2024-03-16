package atividade_lampada;

public class Lampada {
    boolean situacao = false;

    public void ligar(){
        this.situacao = true;
        System.out.println("A lâmpada está ligada!");
    }

    public void desligar(){
        this.situacao = false;
        System.out.println("A lâmpada está desligada!");
    }
}
