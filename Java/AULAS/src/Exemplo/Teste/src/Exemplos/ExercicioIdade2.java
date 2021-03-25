package Exemplos;

import java.util.Scanner;

public class ExercicioIdade2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
			int idade;
			int meses;
			int dias;
			int totalDias;

			System.out.println("Olá, qual a sua idade?: ");
			idade = leia.nextInt();
			System.out.println("E quantos meses de idade você tem?: ");
			meses = leia.nextInt();
			System.out.println("E para finalizar, quantos dias de idade você tem?: ");
			dias = leia.nextInt();
			
			totalDias = ((idade*365) + (meses*30) + (dias));
			System.out.println("Sua idade total é de: "+totalDias);

	}

}
