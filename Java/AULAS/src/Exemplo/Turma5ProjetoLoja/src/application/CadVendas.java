package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Revistas;

public class CadVendas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		//menu
		
			char opcao;
			do {
				System.out.println("Bem vindes a loja GeneGeek!");
				System.out.println("\nEscolha uma categoria para navegar em nosso site");
				System.out.println();
				System.out.println(" 1 - Revistas \n 2 - Jogos \n 3 - DVD'S \n 4 - Sair");
				opcao = leia.next().charAt(0);
				if(opcao == '1') {
					System.out.println("Escolha a categoria de revista que você deseja comprar: ");
					System.out.println("1 - Quadrinhos 2 - Mangás 3 - GameShark 4 - Voltar ao menu anterior.");
					char categoria = leia.next().charAt(0);
					
					Revistas revista1 = new Revistas("revistas de super herois", "1234", 13.40, 10,"quadrinhos","mangás","game shark",0);
					if(categoria == '1') {
						System.out.println("Você escolheu quadrinhos!");
						System.out.println("Digite o numero de quantidades que você deseja:");
						revista1.quantidade();
					} 
					else if(categoria == '2') {
						System.out.println("Você escolheu mangás!");
					}
					else if(categoria == '3') {
						System.out.println("Você escolheu GameShark!");
					} else {
						System.out.println("Você nao escolheu nenhuma das opções válidas, tente novamente.");
					}
				}
			}while(opcao != '1' || opcao != '2' || opcao != '3' || opcao != '4');
				System.out.println("Opção Invalida.");
		
			
		
		
		
		
		
	}

}
