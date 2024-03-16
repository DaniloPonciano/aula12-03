package atividades_08_03.Contador;

public class Contador {
    double valor1 = 0.0;
    double valor2 = 0.0;
    public void incremento(){
        this.valor1++;
    }

    public void decremto(){
        this.valor2--;
    }

    public void exibirValor(){
        System.out.println("O valor incrementado é: " + this.valor1);
    }
    public void exibirValor1(){
        System.out.println("O valor decrementado é: " + this.valor2);
    }
}
