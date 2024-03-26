package atividades_08_03.Temperatura;

public class Temperatura {
    double celsius;
    double fahrenheit;

    public void celsiusParaFahrenheit(){
        this.fahrenheit = (this.celsius * 1.8) + 32;
    }

    public void fahrenheitParaCelsius(){
        this.celsius = (this.fahrenheit - 32) / 1.8;
    }

    public void exibirTemperatura(){
        System.out.println("Temperatura em Celsius convertida para Fahrenheit: " + this.fahrenheit + "°F");
        System.out.println("Temperatura em Fahrenheit convertida para Celsius: " + this.celsius + "°C");
    }
}
