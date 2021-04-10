package application;

import java.util.Locale;
import java.util.Scanner;

public class CadVendas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		char opcao;
		do {
			System.out.println("Bem vindes a loja Geener!");
			System.out.println("\nEscolha uma categoria para navegar em nosso site");
			System.out.println();
			System.out.println(
					" 1 - Biquini \n 2 - Calça \n 3 - Camisa \n 4 - Casaco \n 5 - Chinelo \n 6 - Meia \n 7- Sandalia \n 8 - Sunga \n 9 - Tenis \n 0 - Sair");
			opcao = leia.next().charAt(0);
			if (opcao == '1') {

			}

		} while (opcao != '1' || opcao != '2' || opcao != '3' || opcao != '4' || opcao != '5' || opcao != '6'
				|| opcao != '7' || opcao != '8' || opcao != '9' || opcao != '0');
	}
}