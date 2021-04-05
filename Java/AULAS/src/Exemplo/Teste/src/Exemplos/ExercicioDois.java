package Exemplos;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);

		int n1,n2,n3;
		
		System.out.print("Digite o valor 1: ");
		n1 = leia.nextInt();
		System.out.print("\nDigite o valor 2: ");
		n2 = leia.nextInt();
		System.out.print("\nDigite o valor 3: ");
		n3 = leia.nextInt();
		
		
		if ((n1 < n2) && (n2 < n3)){
			System.out.printf("Os numeros em ordem crescente são: %d %d %d", n1, n2, n3);
		}
			  
			else if((n1 == n2) && (n2 < n3 )) {
				System.out.printf("Os numeros em ordem crescente são: %d %d %d", n1, n2, n2);
			}
			  
			else if((n3 < n2) && (n2 == n3)) {
				 System.out.printf("Os numeros em ordem crescente são: %d %d %d", n1, n2, n3);
			}
			 
			else if((n1 == n3) && (n3 < n2 )) {
				System.out.printf("Os numeros em ordem crescente são: %d %d %d", n1, n3, n2);
			}
			  
			else if((n1 < n3) && (n3 < n2 )) {
				System.out.printf("Os numeros em ordem crescente são: %d %d %d", n1, n3, n2);
			}
			  
			else if((n2<n1) && (n1< n3)){
				System.out.printf("Os numeros em ordem crescente são: %d %d %d", n2, n1, n3);
			}
			  
			else if((n2 < n3) && (n3< n1)) {
				System.out.printf("Os numeros em ordem crescente são: %d %d %d", n1, n3, n1);
			}
			  
			else if((n3 < n1) && (n1 < n2)) {
				 System.out.printf("Os numeros em ordem crescente são: %d %d %d", n3, n1, n2);
			}
			 
			else
			  System.out.printf("Os numeros em ordem crescente são: %d %d %d",n3, n2, n1);
	}

} 		

