package Exemplos;

import java.util.Scanner;

public class ExercioTempoEvento {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int tempoSegundos;
		int horas;
		int minutos;
		int segundos;
		
		System.out.println("Quantas segundos há nesse evento?: ");
		tempoSegundos = leia.nextInt();
		
		horas = ((tempoSegundos/(60*60)));
		minutos = ((tempoSegundos%(60*60)/60));
		segundos = ((tempoSegundos%(60*60)%60));
		
		System.out.println("O tempo do evento é de: "+horas + ":" + minutos + ":" + segundos);
	}
}
