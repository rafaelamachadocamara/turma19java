package VideoAulas;

import java.util.Scanner;

public class ExercicioEstruturaCondicional1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um n�mero: ");
		numero = sc.nextInt();
		
		if(numero < 0){
			System.out.println("Seu n�mero � negativo.");
		}
		else {
			System.out.println("Seu n�mero � positivo.");
		}
		
		sc.close();
	}

}
