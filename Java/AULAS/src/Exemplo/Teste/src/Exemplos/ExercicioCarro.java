package Exemplos;

import java.util.Scanner;

public class ExercicioCarro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

				double impostoEstado = 0.45;
				double impostoFabrica = 0.28;
		        double valorInicial;

		        System.out.println("Digite o valor inicial: ");
		        valorInicial = leia.nextDouble();

		        double total = valorInicial + (valorInicial * impostoEstado) + (valorInicial * impostoFabrica); 
		        System.out.println("O valor total a ser pago � de: "+ total);
		    }
		

	}


