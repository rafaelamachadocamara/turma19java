// Fazer um programa que leia o número de um funcionário, 
// seu número de horas trabalhadas, o valor que recebe por 
// hora e calcula o salário desse funcionário. 
// A seguir, mostre o número e o salário do funcionário, 
// com duas casas decimais.

package VideoAulas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeFixacçao4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int numero;
		int horas;
		double valorHoras;
		double calculoSalario;
		
		nome = sc.next();
		numero = sc.nextInt();
		valorHoras = sc.nextDouble();
		
		calculoSalario = numero * valorHoras;
		
		System.out.println("Seu nome é: " + nome);
		System.out.println("Seu numero de horas trabalhadas é de:  = " + numero);
		System.out.printf("E o total do seu salário é de  = U$ %.2f\n", calculoSalario);
		
		sc.close();
	}

}
