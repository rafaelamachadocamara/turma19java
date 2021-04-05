package Exemplos;

import java.util.Scanner;

public class ExercicioQuatroo {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um numero: ");
		numero = leia.nextInt();
		
		if((numero % 2) == 0){
			System.out.println("O numero " + numero + " é par");
		} 
		else {
			System.out.println("O numero " + numero + " é impar");
		}

	}

}
