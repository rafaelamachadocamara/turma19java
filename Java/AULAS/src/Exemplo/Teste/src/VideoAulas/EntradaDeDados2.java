package VideoAulas;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
				System.out.printf("Voc� digitou: %2f\n", x);

	}

}