package atividades_08_03;

public class Contador {
    double valor = 0.0;
    public void incremento(){
        this.valor++;
    }

    public void decremto(){
        this.valor--;
    }

    public void exibirValor(){
        System.out.println("O valor atual é: " + this.valor);
    }
}
