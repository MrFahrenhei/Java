package estudo.alura.aula1;

public class Temperature {
    public static void main(String[] args) {
        double temperatureInCelsius = 30.4;
        double temperatureInFahrenheit = (temperatureInCelsius * 1.8) + 32;
        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperatureInCelsius, temperatureInFahrenheit);
        System.out.println(mensagem);
        int temperaturaEmFahrenheitInteira = (int) temperatureInFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);

    }
}
