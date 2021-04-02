// Com base na tabela abaixo, escreva um programa que 
// leia o código de um item e a quantidade deste item. 
// A seguir, calcule e mostre o valor da conta a pagar.

package VideoAulas;

import java.util.Scanner;

public class ExercicioEstruturaCondicional5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int codigo;
		int quantidade;
		double total;
		
		System.out.println("Digite o codigo e quantidade do seu pedido: ");
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		
		
		if(codigo == 1) {
			total = quantidade * 4.50;
			System.out.println("Você escolheu " + quantidade + " cachorros quente(s)." );

		} 
		else if(codigo == 2) {
			total = quantidade * 4.50;
			System.out.println("Você escolheu " + quantidade + " x-salada(s).");

		}
		else if(codigo == 3) {
			total = quantidade * 5.00;
			System.out.println("Você escolheu " + quantidade + " x-bacon(s).");

		}
		else if(codigo == 4){
			total = quantidade * 2.00;
			System.out.println("Você escolheu " + quantidade + " torrada simple(s).");

		}
		else{
			total = quantidade * 1.50;
			System.out.println("Você escolheu " + quantidade + " refrigerantes(s).");

		}
		
		System.out.printf("A sua conta total foi de : R$ %.2f%n", total);

		sc.close();
	}

}
