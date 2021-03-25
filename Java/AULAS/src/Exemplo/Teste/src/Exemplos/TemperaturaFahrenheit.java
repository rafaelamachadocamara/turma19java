package Exemplos;

import java.util.Scanner;

public class TemperaturaFahrenheit {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double temperaturaCelsius;
		double temperaturaFahrenheit;
		double resultado;
		
		System.out.println("Digite a temperatura Celsius");
		temperaturaCelsius = leia.nextDouble();
		temperaturaFahrenheit = ((temperaturaCelsius * 9/5) + 32);
		
		System.out.println("A temperatura em grau celsius é: "+temperaturaCelsius);
		System.out.printf("A tempertura em fahrenheit é: %.2f",temperaturaFahrenheit);
		
		
		
		
		
	}

		
}
