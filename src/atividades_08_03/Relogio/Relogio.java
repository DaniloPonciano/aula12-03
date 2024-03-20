package atividades_08_03.Relogio;

public class Relogio {
    int hora = 0;
    int minuto = 0;
    int segundo = 0;

    public void adicionarSegundo (int segundoNovo){
        segundoNovo = this.segundo;
    }

    public void adicionarMinuto (int minutoNovo){
        minutoNovo = this.minuto;
    }

    public void adicionarHora (int horaNova){
        horaNova = this.hora;
    }
    public void exibirHorario (){
        System.out.println("Hora atual (" + this.hora + ":" + this.minuto + ":" + this.segundo + ")");
    }
}
