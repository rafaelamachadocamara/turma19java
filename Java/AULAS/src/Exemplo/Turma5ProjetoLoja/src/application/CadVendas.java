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
					System.out.println("Escolha a categoria de revista que voc� deseja comprar: ");
					System.out.println("1 - Quadrinhos 2 - Mang�s 3 - GameShark 4 - Voltar ao menu anterior.");
					char categoria = leia.next().charAt(0);
					
					Revistas revista1 = new Revistas("revistas de super herois", "1234", 13.40, 10,"quadrinhos","mang�s","game shark",0);
					if(categoria == '1') {
						System.out.println("Voc� escolheu quadrinhos!");
						System.out.println("Digite o numero de quantidades que voc� deseja:");
						revista1.quantidade();
					} 
					else if(categoria == '2') {
						System.out.println("Voc� escolheu mang�s!");
					}
					else if(categoria == '3') {
						System.out.println("Voc� escolheu GameShark!");
					} else {
						System.out.println("Voc� nao escolheu nenhuma das op��es v�lidas, tente novamente.");
					}
				}
			}while(opcao != '1' || opcao != '2' || opcao != '3' || opcao != '4');
				System.out.println("Op��o Invalida.");
		
			
		
		
		
		
		
	}

}
