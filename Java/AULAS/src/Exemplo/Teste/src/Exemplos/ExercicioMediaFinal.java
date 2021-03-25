package Exemplos;

import java.util.Scanner;

public class ExercicioMediaFinal {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		double p1;
		double p2;
		double p3;
		double n1;
		double n2;
		double n3;
		double media;
		
		p1 = 2;
		p2 = 3;
	    p3 = 5;
		
	    System.out.println("Qual a sua nota 1: ");
	    n1 = leia.nextDouble();
	    
	    System.out.println("Qual sua nota 2? ");
	    n2 = leia.nextDouble();

	    System.out.println("Qual sua nota 3? ");
	    n3 = leia.nextDouble();
	    		
	    media = (((n1*p2)+(n2*p2)+(n3*p3))/(p1+p2+p3));
	    System.out.println(media);

	}

}
