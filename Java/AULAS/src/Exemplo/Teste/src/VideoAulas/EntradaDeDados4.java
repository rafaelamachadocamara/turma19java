package VideoAulas;

import java.util.Scanner;

public class EntradaDeDados4 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Esses foram os dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
				
	}

}
