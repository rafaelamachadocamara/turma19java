package VideoAulas;

import java.util.Scanner;

public class ExercicioEstruturaCondicional3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.print("Digite dois n�meros: ");
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		
		if (numero1 % numero2 == 0 || numero2 % numero1 == 0){
			System.out.println("Os n�meros s�o multiplos.");
		}
		else{
			System.out.println("Os n�meros n�o s�o multiplos.");
		}
		sc.close();
			
	}

}
