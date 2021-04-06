// Informar todos os números de 1000 a 1999 
// que quando divididos por 11 obtemos resto = 5. (FOR)

package Exercicios;

public class ExercicioLaçoFor {

	public static void main(String[] args) {
		
		for (int n=1000; n < 2000; n++){
		    if (n % 11 == 5) {
		        System.out.println(n);
		    }
		}
	}

}
