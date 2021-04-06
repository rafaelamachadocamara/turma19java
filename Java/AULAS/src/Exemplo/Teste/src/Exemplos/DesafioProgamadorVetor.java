package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioProgamadorVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		String nomes [] = new String[4];
		double notas [] = new double[4];
		
		for(int x = 0; x < nomes.length; x ++) {
			System.out.println("Digite o seu nome: ");
			nomes[x] = leia.next();
			System.out.println("Digite a nota: ");
			notas[x] = leia.nextDouble();
		}
		
		for(int x = 0; x < nomes.length; x ++) {
			if(notas[x] <5) {
				System.out.printf("%s - nota %.2f Ainda não!\n", nomes[x], notas[x]);
			}
			else if (notas[x] > 5) {
				System.out.printf("%s - nota %.2f Muito bem!\n", nomes[x], notas[x]);
			}
			
			

		}
			
		
		
		

	}

}
