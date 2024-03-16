package aula_contabancaria;

public class ContaBancaria {
    int numeroConta = 0;
    String nomeDoTitular = " ";
    double saldo = 0.0;

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void exibirSaldo(){
        System.out.println("Seu saldo atual é: " + this.saldo);
    }

    public double sacar(double saque){
        if ((this.saldo >= 0) && (saque <= this.saldo)){
            this.saldo -= saque;
        }else{
            System.out.println("Saldo insuficiente");
        }
        return this.saldo;
    }
}
