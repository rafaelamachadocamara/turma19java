package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class Fala300 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int filhos;
		String nome;
		char situacaoEmergencial; // nao esque�a o charAt
		
		System.out.println("Digite seu nome");
		nome = leia.nextLine().toUpperCase();
		System.out.println("Voc� recebeu o auxilio anteriormente? S-SIM N-N�O");
		situacaoEmergencial = leia.next().toUpperCase().charAt(0);
		
		if(situacaoEmergencial == 'S') {
			System.out.println("Voc� recebeu algum auxilio extra, como o bolsa familia? S - SIM N - NAO");
			situacaoEmergencial = leia.next().toUpperCase().charAt(0);
			}
		if(situacaoEmergencial == 'S') {
			
			System.out.printf("Infelizmente voc� n�o tem direito ao auxilio");
		}
			
		
		else if (situacaoEmergencial == 'N') {
			System.out.printf("Voc� � chefe de familia? S - Sim ou N - N�o");
			situacaoEmergencial = leia.next().toUpperCase().charAt(0);

			
		}
		if(situacaoEmergencial == 'S') {
			System.out.println("Voc� vai receber 600 de auxilio");
			System.out.println("Quantos filhos vc tem?");
			filhos = leia.nextInt();
			System.out.println("Valor final a receber"+(600+(filhos*50)));
		}

		else if (situacaoEmergencial == 'N') {
			System.out.println("Quantos filhos voc� tem?");
			filhos = leia.nextInt();
			System.out.printf("Valor final a receber %d\n",(300+(filhos*50)));
		}
	}
	
}
