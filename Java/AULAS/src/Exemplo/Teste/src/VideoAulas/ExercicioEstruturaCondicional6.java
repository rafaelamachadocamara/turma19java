package VideoAulas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEstruturaCondicional6 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		double numero;
		
		System.out.print("Digite um número decimal: ");
		numero = sc.nextDouble();
		
		if(numero < 0.0 || numero > 100.0){
			System.out.println("Fora de intervalo.");
		}
		else if(numero <= 25.0){
			System.out.println("O intervalo é de [0,25]");
		}
		else if(numero <= 50.0){
			System.out.println("O intervalo é de [25,50]");
		}
		else if(numero <= 70.0){
			System.out.println("O intervalo é de [50,75]");
		}
		else{
			System.out.println("O intervalo é de [75,100]");
	}
		sc.close();

}
}
