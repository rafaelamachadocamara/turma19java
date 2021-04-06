package Exemplos;

import java.util.Scanner;

public class DesafioProgramador2OutraForma {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Digite o valor 1: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o valor 2: ");
		numero2 = leia.nextInt();
		
		numero1 = numero1 + numero2;
		numero2 = numero1 - numero2;
		numero1 = numero1 - numero2;
		System.out.println("O valor de 1 é " + numero1 + ", o valor de 2 é " + numero2);
	}

}
