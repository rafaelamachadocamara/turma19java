package Exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteTry {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int nota;
		String nomes [] = new String[3];
		int aux = 0;
		String situacao = "";
		
		try {
			
		System.out.println("Digite a posição da pessoa no vetor");
		aux = leia.nextInt();
		System.out.println("Digite o nome da pessoa: ");
		nomes[aux] = leia.next();
		System.out.println("Digite a nota: ");
		nota = leia.nextInt();
		
		if(nota <= 5) {
			situacao = "ainda não";
		}
		else {
			situacao = "aprovado ";
		}
		}
		catch(InputMismatchException erro) {
			System.out.println("vc nao digitou um numero");
		}
		catch(ArrayIndexOutOfBoundsException erro) {
			System.out.println("vc digitou um numero de vetor que nao existe");
		}
		
		System.out.printf("Oi, %s, sua situaçaõ é %s", nomes[aux],situacao);
	}

}
