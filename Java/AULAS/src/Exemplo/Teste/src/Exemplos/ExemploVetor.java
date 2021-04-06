package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String nomes [] = new String[3];
		String apostolos[] = {"Lucas", "Mateus", "Judas", "Marcos", "Pedro", "Felipe"};
		
		String nome1,nome2,nome3;
		
		nome1 = "Joao";
		nomes[0] = "Paulo";
		nome2 = "Maria";
		nomes[1] = "Madalena";
		nome3 = "Pedro";
		nomes[2] = "Rita";
		
		for(int x = 0; x <apostolos.length; x++) {
			System.out.println(apostolos[x]);
		}
		
		
	}

}
