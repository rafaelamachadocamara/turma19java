package Exemplos;

import java.util.Scanner;

public class ExercicioIdade {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idadeDias;
		int anos;
		int meses;
		int dias;
		
		System.out.println("Digite a idade em dias totais: ");
		idadeDias = leia.nextInt();
		
		anos = ((idadeDias /365));
		meses = ((idadeDias % 365) /30);
		dias = ((idadeDias %365) %30);
		
		System.out.println("Anos: "+anos);
		System.out.println("Meses: "+meses);
		System.out.println("Dias: "+dias);
	}

}
