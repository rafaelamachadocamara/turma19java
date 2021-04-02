package VideoAulas;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresDeAtribui�aoAcumulativa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double conta = 50.0;
		
		System.out.print("Quantos minutos voc� consumiu?: ");
		minutos = sc.nextInt();
		
		if(minutos > 100){
			conta += (minutos - 100) * 2.0;
		}
		System.out.printf("O valor da conta � de R$ %2f\n", conta);
		
		sc.close();
	}
	

}
