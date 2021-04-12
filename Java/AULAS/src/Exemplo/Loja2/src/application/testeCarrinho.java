package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calca;
import entities.Casaco;
import entities.Loja;
import entities.Meia;
import entities.Roupa;
import entities.Tenis;

public class testeCarrinho {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Loja notaFical = new Loja("GEENER", "00.123.987/0001-05");		
		
		double totalCalca = 0;
		double totalCasaco = 0;
		double totalMeia = 0;
		double totalRoupa = 0;
		double totalTenis = 0;
		double totalFinal = 0;
		double desconto = 0;
		double juros1 = 0;
		double juros2 = 0;
		double imposto = 0;
		double valorParcela = 0;				
		
		char opcao;

		do {
			System.out.println("Bem vindes a loja Geener!");
			System.out.println("\nEscolha uma categoria para navegar em nosso site");
			System.out.println();
			System.out.println("1 - Camisa \n2 - Meia \n3 - Calça \n4 - Casaco \n5 - Tenis \n6 - Pagamento");
			opcao = leia.next().charAt(0);
			
			if (opcao < '1' || opcao > '6') {
				System.out.println("Opção invalida, tenta de novo ai...");
		
			}	else if (opcao == '1') {

				Roupa prod = new Roupa("Camisa ", "CDC 0123 R$", 21.50, 10, " Genner ");

				System.out.println(prod.getDescricao() + prod.getCodigo() + prod.getValorunitario() 
				+ prod.getMarca() + " QNT ESTOQUE: " + prod.getQtdeEstoque());
				System.out.println("Qnts unidades deseja? ");

				int quntRoupa = leia.nextInt();
				prod.tirarEstoque(quntRoupa);

				System.out.println("QNT ESTOQUE ATUAL: " + prod.getQtdeEstoque());
				
				totalRoupa =  quntRoupa * 21.50;
				System.out.println("Total Roupas R$"+ totalRoupa);
				

			} else if (opcao == '2') {

				Meia prod2 = new Meia("Meia Top", " CDC 1245 R$", 50.05, 10, " Genner");
				System.out.println(prod2.getDescricao() + prod2.getCodigo() + prod2.getValorunitario()
						+ prod2.getMarca() + " QNT ESTOQUE: " + prod2.getQtdeEstoque());

				System.out.println("Qnts unidades deseja? ");
				int quntMeia = leia.nextInt();

				prod2.tirarEstoque(quntMeia);

				System.out.println("QNT ESTOQUE ATUAL: " + prod2.getQtdeEstoque());
				
				totalMeia =  quntMeia * 50.05;
				System.out.println("Total Meia R$"+ totalMeia);

			} else if (opcao == '3') {

				Calca prod3 = new Calca("Calça Top", " CDC 9856 R$", 159.99, 0, " Genner");
				System.out.println(prod3.getDescricao() + prod3.getCodigo() + prod3.getValorunitario()
						+ prod3.getMarca() + " QNT ESTOQUE: " + prod3.getQtdeEstoque());

				System.out.println("Qnts unidades deseja? ");
				int quntCalca = leia.nextInt();

				prod3.tirarEstoque(quntCalca);

				System.out.println("QNT ESTOQUE ATUAL: " + prod3.getQtdeEstoque());
				
				totalCalca =  quntCalca * 159.99;
				System.out.println("Total Calça R$"+ totalCalca);

			} else if (opcao == '4') {

				Casaco prod4 = new Casaco("Casaco de Frio", " CDC 2587 R$", 120.99, 0, " Genner");
				System.out.println(prod4.getDescricao() + prod4.getCodigo() + prod4.getValorunitario()
						+ prod4.getMarca() + " QNT ESTOQUE: " + prod4.getQtdeEstoque());

				System.out.println("Qnts unidades deseja? ");
				int quntCasaco = leia.nextInt();

				prod4.tirarEstoque(quntCasaco);

				System.out.println("QNT ESTOQUE ATUAL: " + prod4.getQtdeEstoque());
				
				totalCasaco =  quntCasaco * 120.99;
				System.out.println("Total Casaco R$"+ totalCasaco);

			} else if (opcao == '5') {

				Tenis prod5 = new Tenis("Tenis ", " CDC 4650 R$", 200.99, 0, " Genner");
				System.out.println(prod5.getDescricao() + prod5.getCodigo() + prod5.getValorunitario()
						+ prod5.getMarca() + " QNT ESTOQUE: " + prod5.getQtdeEstoque());

				System.out.println("Qnts unidades deseja? ");
				int quntTenis = leia.nextInt();

				prod5.tirarEstoque(quntTenis);

				System.out.println("QNT ESTOQUE ATUAL: " + prod5.getQtdeEstoque());
				
				totalTenis =  quntTenis * 200.99;
				System.out.println("Total Tenis R$"+ totalTenis);

			}
			
		} while (opcao !='6' );
		
		totalFinal = totalCalca + totalCasaco + totalMeia +	totalRoupa + totalTenis;
		System.out.println("VALOR GASTO R$"+ totalFinal);
		
		System.out.println("Forma de Pagamento 1- PG a Vista 2- No Cartão \n3- Parcelado em 1X 4- Parcelado em 2X");
		
		char formaPg=leia.next().charAt(0);
		
		if (formaPg =='1') {
			
			desconto = totalFinal * 0.10;
			totalFinal = totalFinal - desconto;
			imposto = totalFinal * 0.09;
			notaFical.notaFiscal();
			System.out.printf("Valor do desconto %.2f \nValor a ser Pago R$ %.2f", desconto , totalFinal);
			System.out.printf("\nValor Imposto %.2f", imposto);
			
		} else if (formaPg =='2') {
			
			imposto = totalFinal * 0.09;
			notaFical.notaFiscal();
			System.out.printf("Valor a ser Pago R$: %.2f ", totalFinal);
			System.out.printf("\nValor Imposto %.2f", imposto);
			
		} else if (formaPg =='3') {
			
			juros1 = totalFinal * 0.10;
			totalFinal = totalFinal + juros1;
			imposto = totalFinal * 0.09;
			notaFical.notaFiscal();
			System.out.printf("Valor em juros R$ %.2f \nValor a ser Pago R$: ", juros1 , totalFinal);
			System.out.printf("\nValor Imposto %.2f", imposto);
			
		} else if (formaPg =='4') {
			
			juros2 = totalFinal * 0.20;
			totalFinal = totalFinal + juros2;
			valorParcela = totalFinal /2;
			imposto = totalFinal * 0.09;
			
			notaFical.notaFiscal();
			System.out.printf("Valor em juros R$ %.2f \nValor a ser Pago R$ %.2f \nValor de cada Pacela R$ %.2f",juros2,totalFinal,valorParcela);
			System.out.printf("\nValor Imposto %.2f", imposto);
			
		}			
				
	}
	

	}


