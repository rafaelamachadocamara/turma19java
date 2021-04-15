//Leia um valor inteiro X (1 <= X <= 1000). 
//Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o 
//X, se for o caso.

package Exercicios;

import java.util.Scanner;

public class ExercicioLacoRepeticao1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		int x = leia.nextInt();
		
		for(int i =1; i <= x; i++ ) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		leia.close();

		
	}

}
