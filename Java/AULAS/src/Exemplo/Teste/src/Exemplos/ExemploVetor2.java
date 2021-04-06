// 4 pessoas - nome
// 4 pessoas - nota [inteiro entre 1 - 10]
//nome - nota ate 5 > "ainda nao"
// nota acima de 5 a frase é "muito bem"

package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploVetor2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String alunos[] = {"Lucas", "Mateus", "Gabriela", "Vitoria"};
		String notas[] = {"10.0", "4.0", "9.6", "7.5"};

		for(int x = 0; x <alunos.length; x++) {
			System.out.println(alunos[x]);
		}
			

	}


	}
	
