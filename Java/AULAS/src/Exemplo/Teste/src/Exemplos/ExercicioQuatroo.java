package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuatroo {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double numero;
		double raiz;
		double quadrado;
		
		System.out.print("Digite um numero: ");
		numero = leia.nextDouble();
		
		if((numero % 2) == 0){
			System.out.println("O numero " + numero + " � par");
			raiz = Math.sqrt(numero);
			System.out.printf("A raiz quadrada de %.2f � igual � %.2f ", numero, raiz);

		} 
		else {
			System.out.println("O numero " + numero + " � impar\n");
			quadrado = Math.pow(numero, 2);
			System.out.printf("O numero %.2f ao quadrado � %.2f", numero, quadrado);
		}

	}

}
