package Exemplos;

import java.util.Scanner;

public class Fala3002 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String op;
		int filhos;
		boolean bolsa;
		
		System.out.println("Você recebeu Auxilio Emergencial anteriormente? 1 - SIM 2 - NAO");
		op = leia.next();
		if(op== "1") {
			
		}
		System.out.println("Você recebeu bolsa familia: '1 - sim ou 2 - nao");
		op = (leia.next());
		if(op == "1") {
			bolsa = true;
		}
	}

}
