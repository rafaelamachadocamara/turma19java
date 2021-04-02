package VideoAulas;

import java.util.Scanner;

public class ExercicioEstruturaCondicional3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.print("Digite dois números: ");
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		
		if (numero1 % numero2 == 0 || numero2 % numero1 == 0){
			System.out.println("Os números são multiplos.");
		}
		else{
			System.out.println("Os números não são multiplos.");
		}
		sc.close();
			
	}

}
