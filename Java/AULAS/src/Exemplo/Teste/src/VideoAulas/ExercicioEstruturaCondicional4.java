package VideoAulas;

import java.util.Scanner;
public class ExercicioEstruturaCondicional4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial;
		int horaFinal;
		int duracao;
		
		System.out.print("Que horas o jogo começou?: ");
		horaInicial = sc.nextInt();
		
		System.out.print("Que horas o jogo terminou?: ");
		horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O jogo durou " + duracao + " hora(s)");
		
		sc.close();
	}	
}
