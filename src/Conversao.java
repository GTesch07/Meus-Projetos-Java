public class Conversao {
    public static void main(String[] args) {
        double temperaturaCelsius = 25.0;
        double conversaoFahrenheit  = (temperaturaCelsius * 1.8) + 32;

        int resultado = (int) conversaoFahrenheit;
        System.out.println("A conversão de " + temperaturaCelsius + " Celsius para Fahrenheit é igual a " + resultado);
    }
}
