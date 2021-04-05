package Exemplos;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Quantos anos você possui?");
		idade = leia.nextInt();
		
		if((idade >= 10) && (idade <= 14 )) {
			System.out.println("Você está na fase infantil.");
		}
		else if((idade >=15) && (idade <= 17)){
			System.out.println("Você está na fase infanto juvenil.");
		}
		else if((idade >= 18) && (idade <= 25)) {
			System.out.println("Você está na fase adulta.");
		}
		else {
			System.out.println("Digite uma idade valida.");
		}
	}

}
