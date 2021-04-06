package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class LaçoPara {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		
		final double HABITANTES = 20;
		double salario = 0.00;
		double numeroFilhos = 0; 
		double mediaSalario = 0.00;
		double totalSalario = 0.00;
		double mediaFilhos = 0.00;
		double totalFilhos = 0.00;
		double maiorSalario = 0.00;
		double percentualPessoasSalarioAte100 = 100.00;
		double contadorPessoasSalario100 = 0;
		
		for (int x = 1; x <=HABITANTES; x++) {
			// dentro do laço
			System.out.print("Informe o salario do habitante "+x+" R$ : ");
			//System.out.printf("Informe o salario do habitante %d R$ : ",x);
			salario = leia.nextDouble();
			System.out.print("\nInforme a quantidade de filhos:");
			numeroFilhos = leia.nextDouble();
			totalSalario = totalSalario + salario;
			
			
		}
		// fora do laço 
		mediaSalario = totalSalario / HABITANTES;
		
		System.out.printf("\nTotal dos salarios R$ %.2f", totalSalario);
		System.out.printf("\nMedia dos salarios R$ %.2f", mediaSalario);

		
	}

}
