// Fazer um programa que leia o n�mero de um funcion�rio, 
// seu n�mero de horas trabalhadas, o valor que recebe por 
// hora e calcula o sal�rio desse funcion�rio. 
// A seguir, mostre o n�mero e o sal�rio do funcion�rio, 
// com duas casas decimais.

package VideoAulas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeFixac�ao4 {

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
		
		System.out.println("Seu nome �: " + nome);
		System.out.println("Seu numero de horas trabalhadas � de:  = " + numero);
		System.out.printf("E o total do seu sal�rio � de  = U$ %.2f\n", calculoSalario);
		
		sc.close();
	}

}
