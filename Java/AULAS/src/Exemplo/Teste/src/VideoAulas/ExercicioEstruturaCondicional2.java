package VideoAulas;

import java.util.Scanner;

public class ExercicioEstruturaCondicional2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um n�mero ");
		numero = sc.nextInt();
		
		if(numero % 2 == 0){
			System.out.println("Seu n�mero � par.");
		}
		else{
			System.out.println("Seu n�mero � impar.");
		}
		sc.close();
	}

}
