package VideoAulas;

import java.util.Scanner;

public class ExercicioDeFixaçao2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1;
		int n2;
		int resultado;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		resultado = n1 + n2;
		
		System.out.println("O Resultado da soma dos dois numeros é: " + resultado);

		sc.close();


	}

}
