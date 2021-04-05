package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploDeLogica {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //instaciado o tipo de moeda / teclado / decimais
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);

		
		int numero; //numero inteiro
		
		System.out.print("Digite um numero: ");
		numero = leia.nextInt();
		parImpar(numero);
		System.out.println("Fim de programa!!");
		
		
	}
	public static void parImpar(int numero) {
		if((numero%2) == 0 && numero >= 0) {
			System.out.println("Numero par");
		}
		else if((numero%2) == 1 && numero > 0) {
			System.out.println("Numero impar");
		}
		
	}

}
