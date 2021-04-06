// Solicitar a idade de várias pessoas e imprimir: 
//Total de pessoas com menos de 21 anos. 
// Total de pessoas com mais de 50 anos. 
// O programa termina quando idade for =-99. (WHILE)


package Exercicios;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		int contador21 = 0;
		int contador50 =0;
		
		System.out.print("Digite a sua idade: ");
		idade = leia.nextInt();
		
		while(idade!=-99) {
			if(idade<21) contador21++;
            if(idade>50) contador50++;
            System.out.println("\n Digite a idade da pessoa (para Sair digite -99) : ");
            System.out.printf("%d",idade);
        }
		System.out.printf("\n O Total com menos de 21 anos E:%d",contador21);
		System.out.printf("\n O Total com mais de 50 anos é: %d",contador50);
		System.out.printf("\n\n");  
		}
	}


