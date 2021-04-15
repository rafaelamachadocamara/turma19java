package VideoAulas;

import java.util.Locale;
import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);

		char resp = 's';

		while (resp != 'n') {
			System.out.println("Digite a temperatura em celsius");
			double c = leia.nextDouble();
			double f = 9.0 * c / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			System.out.print("Deseja repetir? S - SIM N - NAO ");
			resp = leia.next().charAt(0);
		}
	}

}
