package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class Fala300 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int filhos;
		String nome;
		char situacaoEmergencial; // nao esqueça o charAt
		
		System.out.println("Digite seu nome");
		nome = leia.nextLine().toUpperCase();
		System.out.println("Você recebeu o auxilio anteriormente? S-SIM N-NÃO");
		situacaoEmergencial = leia.next().toUpperCase().charAt(0);
		
		if(situacaoEmergencial == 'S') {
			System.out.println("Você recebeu algum auxilio extra, como o bolsa familia? S - SIM N - NAO");
			situacaoEmergencial = leia.next().toUpperCase().charAt(0);
			}
		if(situacaoEmergencial == 'S') {
			
			System.out.printf("Infelizmente você não tem direito ao auxilio");
		}
			
		
		else if (situacaoEmergencial == 'N') {
			System.out.printf("Você é chefe de familia? S - Sim ou N - Não");
			situacaoEmergencial = leia.next().toUpperCase().charAt(0);

			
		}
		if(situacaoEmergencial == 'S') {
			System.out.println("Você vai receber 600 de auxilio");
			System.out.println("Quantos filhos vc tem?");
			filhos = leia.nextInt();
			System.out.println("Valor final a receber"+(600+(filhos*50)));
		}

		else if (situacaoEmergencial == 'N') {
			System.out.println("Quantos filhos você tem?");
			filhos = leia.nextInt();
			System.out.printf("Valor final a receber %d\n",(300+(filhos*50)));
		}
	}
	
}
